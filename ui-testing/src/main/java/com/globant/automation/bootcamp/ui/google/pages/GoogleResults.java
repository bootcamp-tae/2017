package com.globant.automation.bootcamp.ui.google.pages;

import com.globant.automation.bootcamp.webdriver.web.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleResults extends Page {

  @FindBy(xpath = "//h3[@class='r']")
  private List<WebElement> results;

  public AnotherPage selectResult(int index) {
    results.get(index).click();
    return new AnotherPage(getDriver());
  }
}
