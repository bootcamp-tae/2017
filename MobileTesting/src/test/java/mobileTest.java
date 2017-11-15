import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class mobileTest {

    @Test
    public void haceralgo() throws MalformedURLException {
        /*
        Capabilities: configuraciones que definen el comportamiento del driver de navegación.
         Example:
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        */


        WebDriver driver = new AndroidDriver<>(new URL("hhtp://localhost:4723/wb/hub"), //4723 direccion proporcionada por Appium.
                                                DesiredCapabilities.android());

    }
}
