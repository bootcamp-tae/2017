package framework.mobile;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum Devices{

    ANDROID{
        public Capabilities getCapabilities(){
                // Crea capabilities de android y especifica el tipo de dispositivo y plataforma.
            DesiredCapabilities caps = DesiredCapabilities.android();
            caps.setCapability("deviceName","android");
            caps.setCapability("platformName","android");
            return caps;
        }
    },
    IOS{
        public Capabilities getCapabilities(){
            return DesiredCapabilities.iphone();
        }
    };

    public Capabilities getCapabilities() { // TODO : DELETE THIS WHEN QUESTIONS SOLVED.
        DesiredCapabilities caps = DesiredCapabilities.android();
        caps.setCapability("deviceName","android");
        caps.setCapability("platformName","android");
        return caps;
    }
}
