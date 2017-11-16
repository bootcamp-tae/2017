package framework.mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public enum Context {

    INSTANCE;
    private static final ThreadLocal<WebDriver> DRIVERS_PER_THREAD= new ThreadLocal<>(); //map with ThreadId : Driver

    public WebDriver init(DesiredCapabilities capabilities) throws MalformedURLException {
        // Defines the property of the webDriverServer, where it will connect when the tests starts.
        URL url = new URL(System.getProperty("WEB_DRIVER_URL", "http://127.0.0.1:4723/wd/hub"));

        return init(url, capabilities); //Calls the second private method that will generate the respective driver.
    }

    //Private cause its an internal mechanism
    private WebDriver init(URL webDriverServer, Capabilities capabilities){
        finish(); //Finish the actual driver.

        //Creates an AppiumDriver with the previously setted url and caps and add it to the Drivers Per Thread.
        WebDriver driver = new AppiumDriver<>(webDriverServer, capabilities);
        DRIVERS_PER_THREAD.set(driver);
        return driver;
    }

    public WebDriver getDriver(){
        return DRIVERS_PER_THREAD.get();
    }

    public void finish(){
        WebDriver driver = getDriver(); //Gets the actual driver and finish the session plus remove the driver from the Drivers Per Thread
        if(driver != null){
            driver.quit();
        }
        DRIVERS_PER_THREAD.remove();
    }


}
