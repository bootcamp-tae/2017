package com.globant.automation.bootcamp.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHome {
  private static final By GOOGLE_SEARCH_TEXT_BOX = By.id("lst-ib");
  private final WebDriver driver;

  public GoogleHome(WebDriver driver) {
    this.driver = driver;
  }

  public GoogleResults search(String criteria) {
    driver.findElement(GOOGLE_SEARCH_TEXT_BOX).sendKeys(criteria + Keys.ENTER);
    return new GoogleResults(driver);
  }
}
