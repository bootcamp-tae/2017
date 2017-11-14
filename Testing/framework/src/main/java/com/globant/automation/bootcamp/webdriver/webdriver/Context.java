package com.globant.automation.bootcamp.webdriver.webdriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

enum Context {

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
    WebDriver init(Browser browser) throws MalformedURLException {

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

    /**
     * Este metodo me permite terminar el Thread que corre el Test finalice/falle;
     * de este modo puedo eliminar su referencia en el ThreadLocal liberando asi
     * espacio
     */
    void terminate() {
        WebDriver driver = getDriver();
        if (driver != null) {
            getDriver().quit();
        }
        DRIVERS_PER_THREAD.remove();
    }
}