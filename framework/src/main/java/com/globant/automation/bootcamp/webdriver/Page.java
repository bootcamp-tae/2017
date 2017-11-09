package com.globant.automation.bootcamp.webdriver;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public abstract class Page {

  protected Page() {
    PageFactory.initElements(getDriver(), this);
  }

  protected WebDriver getDriver() {
    return Context.INSTANCE.getDriver();
  }

  protected Page selectByText(WebElement element, String text) {
    waitFor(visibilityOf(element));
    new Select(element).selectByVisibleText(text);
    return this;
  }

  protected Page selectByValue(WebElement element, String value) {
    waitFor(visibilityOf(element));
    new Select(element).selectByValue(value);
    return this;
  }

  protected Page selectByIndex(WebElement element, int index) {
    waitFor(visibilityOf(element));
    new Select(element).selectByIndex(index);
    return this;
  }

  protected Page type(WebElement element, String text) {
    waitFor(visibilityOf(element));
    element.sendKeys(text);
    return this;
  }

  protected void click(WebElement element) {
    waitFor(elementToBeClickable(element));
    element.click();
  }

  protected String getText(WebElement element) {
    waitFor(visibilityOf(element));
    return element.getText();
  }

  protected <T> void waitFor(ExpectedCondition<T> condition) {
    new FluentWait<>(getDriver())
        .withTimeout(60, SECONDS)
        .pollingEvery(1, SECONDS)
        .ignoring(NoSuchElementException.class)
        .until(condition);
  }

}
