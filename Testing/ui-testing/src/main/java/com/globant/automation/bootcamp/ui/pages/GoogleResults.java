package com.globant.automation.bootcamp.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleResults {

  @FindBy(xpath = "//h3{@class='r'"])
  private List<WebElement> results;

  //private static final By GOOGLE_RESULT_LINKS = By.xpath("//h3[@class='r']");

  private final WebDriver driver;

  GoogleResults(WebDriver driver) {
    super
    PageFactory.initElements(driver, this);
    this.driver = driver;
  }

  public AnotherPage selectResult(int index) {
    driver.findElements(GOOGLE_RESULT_LINKS).get(index).click();
    return new AnotherPage(driver);
  }
}
