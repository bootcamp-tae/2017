package com.globant.automation.bootcamp.webdriver.webdriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

public abstract class Component extends CommonOperations {

  /**
   *
   * @param container
   */
  protected Component(WebElement container) {
      PageFactory.initElements((new DefaultElementLocatorFactory(container)), this);
  }

}
