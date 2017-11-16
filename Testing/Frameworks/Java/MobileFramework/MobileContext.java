package MobileFramework;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static MobileFramework.Devices.*;

public enum MobileContext {
    INSTANCE;

    private static final ThreadLocal<WebDriver> DRIVERS_PER_THREAD = new ThreadLocal<>();

    protected WebDriver getDriver(){
        return DRIVERS_PER_THREAD.get();
    }


    public URL conection() throws MalformedURLException {
        URL url = new URL(System.getProperty( "WEB_DRIVER_URL", "http://192.168.1.22:4723/wd/hub"));
        return  url;
    }

    public WebDriver initAndroid(DesiredCapabilities desiredCapabilities) throws MalformedURLException {
        WebDriver driver = new AndroidDriver<>(this.conection(),desiredCapabilities);
        DRIVERS_PER_THREAD.set(driver);
        return driver;
    }

    void finish() {
        WebDriver driver = getDriver();
        if (driver != null) {
            getDriver().quit();
        }
        DRIVERS_PER_THREAD.remove();
    }


}
