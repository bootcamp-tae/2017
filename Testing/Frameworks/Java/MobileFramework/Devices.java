package MobileFramework;

import org.openqa.selenium.remote.DesiredCapabilities;

public enum Devices {

    ANDROID {
        DesiredCapabilities getDesiredCapabilities() {
            DesiredCapabilities desiredCapabilities = DesiredCapabilities.android();
            desiredCapabilities.setCapability("deviceName", "android");
            desiredCapabilities.setCapability("platformName", "android");
            return desiredCapabilities;
        }
    },
    APPLE;


     }


