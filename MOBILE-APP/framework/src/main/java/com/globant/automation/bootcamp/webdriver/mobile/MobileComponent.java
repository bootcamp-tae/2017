package com.globant.automation.bootcamp.webdriver.mobile;

import com.globant.automation.bootcamp.webdriver.CommonOperations;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MobileComponent extends CommonOperations {

  public MobileComponent(WebElement container) {
    PageFactory.initElements(new AppiumFieldDecorator(container), this);
  }

}
