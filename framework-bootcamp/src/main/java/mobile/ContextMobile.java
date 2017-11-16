package mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public enum ContextMobile {
    INSTANCE;

    private static final ThreadLocal<WebDriver> DRIVERS_PER_THREAD = new ThreadLocal<>();

    WebDriver getDriver() {
        return DRIVERS_PER_THREAD.get();
    }

    public WebDriver init(Capabilities capabilities) throws MalformedURLException {

        URL url = new URL(System.getProperty("WEB_DRIVER_URL", "http://127.0.0.1:4723/wd/hub"));

        return init(url, capabilities);

    }

    private WebDriver init(URL webDriverServer, Capabilities capabilities) throws MalformedURLException {

        terminate(); // Just in case we have an existing driver running in the same thread

        WebDriver driver = new AppiumDriver<>(webDriverServer, capabilities);

        DRIVERS_PER_THREAD.set(driver);

        return driver;
    }

    public void terminate() {
        WebDriver driver = getDriver();
        if (driver != null) {
            getDriver().quit();
        }
        DRIVERS_PER_THREAD.remove();
    }
}
