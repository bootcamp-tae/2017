package com.globant.automation.bootcamp.mobile.tests;

import com.globant.automation.bootcamp.mobile.pages.CalculatorPage;
import com.globant.automation.bootcamp.webdriver.mobile.MobileTest;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SampleMobileTest extends MobileTest<CalculatorPage> {

  @Test
  public void addTest() {
    String result = getInitialPage().two().plus().two().is();
    assertThat("2 + 2 = 4", result, is("4"));
  }

  @Override
  protected CalculatorPage getInitialPage() {
    return new CalculatorPage();
  }

  @Override
  protected void setCapabilities(DesiredCapabilities capabilities) {
    capabilities.setCapability("appPackage", "com.android.calculator2");
    capabilities.setCapability("appActivity", ".CalculatorPage");
  }


}

