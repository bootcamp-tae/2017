package com.globant.automation.bootcamp.webdriver.web;

import com.globant.automation.bootcamp.webdriver.CommonOperations;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;

public abstract class Component extends CommonOperations {

  protected Component(WebElement container) {
    PageFactory.initElements(new DefaultFieldDecorator(new DefaultElementLocatorFactory(container)), this);
  }

}
