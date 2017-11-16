package framework.mobile;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidConfiguration {
    public static Capabilities getCapabilities(){
        // Crea capabilities de android y especifica el tipo de dispositivo y plataforma.
        DesiredCapabilities caps = DesiredCapabilities.android();
        caps.setCapability("deviceName","android");
        caps.setCapability("platformName","android");
        return caps;
    }
}
