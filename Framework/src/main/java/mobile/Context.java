package mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public enum Context {

    INSTANCE:

    private static final


    private WebDriver init(Capabilities capabilities){
        URL url = new URL(System.getProperty("WEB_DRIVER_URL", "http://127.0.0.1:4723/wb/hub"));

        return init(url, capabilities);
    }

    private WebDriver init(URL webDriverServer, Capabilities capabilities){
        terminate();

        WebDriver driver = new AppiumDriver<>()
    }


}
