package MobileFramework;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

public abstract class AndroidViewsTest <T extends GeneralMobileOperations> {

    @Before
    public  void SetUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = this.getDesiredCapabilities();
        WebDriver driver = MobileContext.INSTANCE.initAndroid(desiredCapabilities);
    }

    @After

    public void setDown(){
        MobileContext.INSTANCE.finish();
    }

    public DesiredCapabilities getDesiredCapabilities()
    {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "android");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appPackage","com.google.android.youtube");
        desiredCapabilities.setCapability("appActivity","com.google.android.apps.youtube.app.WatchWhileActivity");
        return desiredCapabilities;
    }
}


