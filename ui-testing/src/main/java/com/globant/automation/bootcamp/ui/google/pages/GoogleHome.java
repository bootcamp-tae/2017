package com.globant.automation.bootcamp.ui.google.pages;

import com.globant.automation.bootcamp.webdriver.web.Page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHome extends Page {

  @FindBy(id = "lst-ib")
  private WebElement searchBox;

  public GoogleResults search(String criteria) {
    searchBox.sendKeys(criteria + Keys.ENTER);
    return new GoogleResults();
  }

}
