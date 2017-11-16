package mobile;

import bootcamp.Elements.Initializable;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import logging.Logging;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum Devices implements  HasCapabilities {

    ANDROID{
        @Override
        public Capabilities getCapabilities() {
                DesiredCapabilities capabilities = DesiredCapabilities.android();
                capabilities.setCapability("platformName", "android");
                capabilities.setCapability("deviceName", "android");
                return capabilities;
            }
        }
    }
