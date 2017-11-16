package com.globant.automation.bootcamp.webDriver.Mobile;

import com.globant.automation.bootcamp.logging.Logging;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum Devices  implements HasCapabilities, Logging {
    ANDROID{
        @Override
        public Capabilities getCapabilities() {
            DesiredCapabilities capabilities = DesiredCapabilities.android();
            capabilities.setCapability("deviceName", "android");
            capabilities.setCapability("platformName", "android");
            return capabilities;
        }
    }
}
