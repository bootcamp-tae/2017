package com.globant.bootcamp.tests;

import com.globant.automation.bootcamp.webdriver.mobile.MobileTest;
import com.globant.bootcamp.CalculatorScreen;
import org.junit.*;
import org.openqa.selenium.remote.DesiredCapabilities;


/**
 * Created by Facundo on 14/11/2017.
 */
public class CalculatorTest extends MobileTest<CalculatorScreen> {

    @Test
    public void testPlus() {
        getInitialScreen()
                .six()
                .plus()
                .two()
                .isEquals();

        Assert.assertEquals("8", getInitialScreen().result());
    }

    @Test
    public void testMinus() {
        getInitialScreen()
                .six()
                .minus()
                .two()
                .isEquals();

        Assert.assertEquals("4", getInitialScreen().result());
    }

    @Test
    public void testMultiply() {
        getInitialScreen()
                .six()
                .multiply()
                .two()
                .isEquals();

        Assert.assertEquals("12", getInitialScreen().result());
    }

    @Test
    public void testDivide() {
        getInitialScreen()
                .six()
                .divide()
                .two()
                .isEquals();

        Assert.assertEquals("3", getInitialScreen().result());
    }


    @Override
    public CalculatorScreen getInitialScreen() {
        return new CalculatorScreen();
    }

    @Override
    public void setCapabilities(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
    }


}
