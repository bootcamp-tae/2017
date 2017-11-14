package bootcamp.Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

enum ContextDriver {

    INSTANCE;

    private static final ThreadLocal<WebDriver> driver_thread=new ThreadLocal<>();

    WebDriver getDriver(){
        return driver_thread.get();
    }

    WebDriver init(Browser browser) throws MalformedURLException {

        terminate(); // Just in case we have an existing driver running in the same thread

        browser.initialize();

        SeleniumServerBoot.INSTANCE.start();

        URL url = new URL(System.getProperty("SELENIUM_URL", "http://127.0.0.1:4444/wd/hub"));

        WebDriver driver = new RemoteWebDriver(url, browser.getCapabilities());

        driver_thread.set(driver);

        return driver;
    }

    void terminate() {
        WebDriver driver = getDriver();
        if (driver != null) {
            getDriver().quit();
        }
        driver_thread.remove();
    }

}
