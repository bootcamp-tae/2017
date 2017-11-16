package com.globant.bootcamp.tests;

import com.globant.automation.bootcamp.webdriver.mobile.MobileTest;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.CalculatorPage;

public class SampleMobileTest extends MobileTest<CalculatorPage>{


    @Test
    public void testCalculator(){
        CalculatorPage calculatorPage = getInitialPage();
        calculatorPage.two();
        calculatorPage.plus();
        calculatorPage.three();
        String result =  calculatorPage.getResult();

        Assert.assertThat("2 + 3 = 5", result, Matchers.is(result));
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
