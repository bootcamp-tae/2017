package com.globant.automation.bootcamp.webdriver.mobile;

import com.globant.automation.bootcamp.webdriver.web.Initializable;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by Facundo on 15/11/2017.
 */
public enum OperSyst implements HasCapabilities {

    ANDROID {
        @Override
        public Capabilities getCapabilities() {
            DesiredCapabilities capabilities = DesiredCapabilities.android();

            capabilities.setCapability("deviceName", "192.168.242.101:5555");
            capabilities.setCapability("platformName", "Android");

            return capabilities;
        }
    }
}
