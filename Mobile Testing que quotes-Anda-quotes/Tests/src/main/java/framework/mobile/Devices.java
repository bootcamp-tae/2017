package framework.mobile;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum Devices{

    ANDROID{

    },
    IOS{
        public Capabilities getCapabilities(){
            return DesiredCapabilities.iphone();
        }
    };

}
