package com.globant.bootcamp.tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileTest {

    private AndroidDriver<MobileElement> driver;

    class SoyUnPageObject {

        @AndroidFindBy(id = "daID")
        private MobileElement daElement;

        public void click() {
            daElement.click();
        }
    }

    @Test
    public void crapTest() throws MalformedURLException {
        driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), DesiredCapabilities.android());
        driver.findElements(By.id("LOCATOR HERE!"));
        driver.quit();
    }

}