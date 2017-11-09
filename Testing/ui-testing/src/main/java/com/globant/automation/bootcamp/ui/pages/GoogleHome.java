package com.globant.automation.bootcamp.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHome extends Page{

  @FindBy(id = "lst-ib")
  private WebElement searchBox;

  private static final By GOOGLE_SEARCH_TEXT_BOX = By.id("lst-ib");
  private final WebDriver driver;

  public GoogleHome(WebDriver driver) {
    super (driver);
  }

  public GoogleResults search(String criteria) {
    searchBox.sendKeys().sendKeys(criteria + Keys.ENTER);
    //driver.findElement(GOOGLE_SEARCH_TEXT_BOX).sendKeys(criteria + Keys.ENTER);
    return new GoogleResults(driver);
  }
}
