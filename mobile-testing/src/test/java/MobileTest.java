import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.management.modelmbean.DescriptorSupport;
import java.net.MalformedURLException;
import java.net.URL;

public class MobileTest {

    @Test
    public void crapTest() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        WebDriver driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), DesiredCapabilities.android());
        // Trae las configuraciones de android por defecto.

        driver.findElement(By.id(""));
    }
}