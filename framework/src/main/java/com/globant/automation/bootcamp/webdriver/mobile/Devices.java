package com.globant.automation.bootcamp.webdriver.mobile;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

enum Devices implements HasCapabilities {

    ANDROID {
        @Override
        public Capabilities getCapabilities() {
            DesiredCapabilities capabilities = DesiredCapabilities.android();
            capabilities.setCapability("platformName", "android");
            capabilities.setCapability("deviceName", "android");
            return capabilities;
        }
    }

}