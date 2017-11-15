package com.globant.bootcamp.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Facundo on 14/11/2017.
 */
public class CalculatorTest /*extends MobileTest</*I think here it goes initial Screen>*/{

    private AppiumDriver driver;

    @Before
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "192.168.242.101:5555");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        driver = new AndroidDriver<>(
                new URL("http://127.0.0.1:4723/wd/hub"),
                capabilities);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testPlus() {
        driver.findElement(By.id("digit_2")).click();
        driver.findElement(By.id("op_add")).click();
        driver.findElement(By.id("digit_6")).click();
        driver.findElement(By.id("eq")).click();

        Assert.assertEquals("8", driver.findElement(By.id("formula")).getText());
    }

    @Test
    public void testMinus() {
        driver.findElement(By.id("digit_8")).click();
        driver.findElement(By.id("op_sub")).click();
        driver.findElement(By.id("digit_4")).click();
        driver.findElement(By.id("eq")).click();

        Assert.assertEquals("4", driver.findElement(By.id("formula")).getText());
    }

    @Test
    public void testMultiply() {
        driver.findElement(By.id("digit_8")).click();
        driver.findElement(By.id("op_mul")).click();
        driver.findElement(By.id("digit_4")).click();
        driver.findElement(By.id("eq")).click();

        Assert.assertEquals("32", driver.findElement(By.id("formula")).getText());
    }

    @Test
    public void testDivide() {
        driver.findElement(By.id("digit_1")).click();
        driver.findElement(By.id("digit_0")).click();
        driver.findElement(By.id("digit_0")).click();
        driver.findElement(By.id("op_div")).click();
        driver.findElement(By.id("digit_5")).click();
        driver.findElement(By.id("eq")).click();

        Assert.assertEquals("20", driver.findElement(By.id("formula")).getText());
    }

    @Test
    public void testAllInOne() {
        driver.findElement(By.id("digit_2")).click();
        driver.findElement(By.id("digit_4")).click();
        driver.findElement(By.id("op_add")).click();
        driver.findElement(By.id("digit_8")).click();
        driver.findElement(By.id("op_sub")).click();
        driver.findElement(By.id("digit_2")).click();

        driver.findElement(By.id("eq")).click();
        //30

        driver.findElement(By.id("op_div")).click();
        driver.findElement(By.id("digit_3")).click();

        driver.findElement(By.id("eq")).click();
        //10

        driver.findElement(By.id("op_mul")).click();
        driver.findElement(By.id("digit_4")).click();

        driver.findElement(By.id("eq")).click();
        //40
        
        Assert.assertEquals("40", driver.findElement(By.id("formula")).getText());
    }

    @Test
    public void testAll() {
        testPlus();
        testMinus();
        testMultiply();
        testDivide();
    }

}
