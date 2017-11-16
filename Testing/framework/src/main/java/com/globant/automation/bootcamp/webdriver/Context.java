package com.globant.automation.bootcamp.webdriver;


import com.globant.automation.bootcamp.webdriver.webdriver.Browser;
import com.globant.automation.bootcamp.webdriver.webdriver.SeleniumServerBoot;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public enum Context {

    //SINGLETON
    INSTANCE;

    private static final ThreadLocal<WebDriver> DRIVERS_PER_THREAD = new ThreadLocal<>();

    /**
     * @return Retorna el driver perteneciente al Thread que accede a la coleccion
     */
    WebDriver getDriver() {
        return DRIVERS_PER_THREAD.get();
    }

    /**
     * Metodo para solicitar el driver de los navagadores, esta implementacion me encapsula
     * tanto la tecnologia(WebDriver), como la instanciacion
     * @param browser Enum de navegador a utilizar en el test
     * @return El driver del navegador
     */
    public WebDriver init(Browser browser) throws MalformedURLException {

        terminate();

        browser.initialize();

        SeleniumServerBoot.INSTANCE.start();

        //URL url = new URL(System.getProperty("SELENIUM_URL", "http://127.0.0.1:4444/wd/hub"));

        //WebDriver driver = new RemoteWebDriver(url, browser.getCapabilities());

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),browser.getCapabilities());
        //Asigna el driver al Thread que lo solicito
        DRIVERS_PER_THREAD.set(driver);
        return driver;
    }

    public WebDriver init(Capabilities capabilities) throws MalformedURLException {

        URL url = new URL(System.getProperty("WEB_DRIVER_URL", "http://127.0.0.1:4723/wd/hub"));

        return init(url, capabilities);

    }

    private WebDriver init(URL webDriverServer, Capabilities capabilities) throws MalformedURLException {

        terminate(); // Just in case we have an existing driver running in the same thread

        //Just dont forget to assing a deviceName as a capability
        boolean isMobile = capabilities.getCapability("deviceName") != null;

        WebDriver driver = isMobile ? new AppiumDriver<>(webDriverServer, capabilities) : new RemoteWebDriver(webDriverServer, capabilities);

        DRIVERS_PER_THREAD.set(driver);

        return driver;
    }

    /**
     * Este metodo me permite terminar el Thread que corre el Test finalice/falle;
     * de este modo puedo eliminar su referencia en el ThreadLocal liberando asi
     * espacio
     */
    public void terminate() {
        WebDriver driver = getDriver();
        if (driver != null) {
            getDriver().quit();
        }
        DRIVERS_PER_THREAD.remove();
    }
}