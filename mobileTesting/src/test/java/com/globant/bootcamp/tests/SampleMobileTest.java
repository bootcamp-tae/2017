package com.globant.bootcamp.tests;

import com.globant.automation.bootcamp.webdriver.mobile.MobileTest;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.CalculatorPage;

public class SampleMobileTest extends MobileTest<CalculatorPage>{


    @Test
    public void testCalculator(){
        CalculatorPage calculatorPage = getInitialPage();
        calculatorPage.two();
        calculatorPage.three();
        calculatorPage.plus();
        calculatorPage.result();
    }

    @Override
    protected CalculatorPage getInitialPage() {
        return new CalculatorPage();
    }

    @Override
    public void setCapabilities(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage" , "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
    }


}
