package com.globant.automation.bootcamp.webdriver.webdriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

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
    WebDriver init(Browser browser) {
        WebDriver driver = null;
        switch (browser) {
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
            case IE:
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            case EDGE:
                EdgeDriverManager.getInstance().setup();
                driver = new EdgeDriver();
                break;
        }
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