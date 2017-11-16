package com.globant.automation.bootcamp.mobile.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class CalculatorPage extends CalculatorBasePage {

  @AndroidFindBy(id = ANDROID_PREFIX + "digit_2")
  private WebElement two;

  @AndroidFindBy(id = ANDROID_PREFIX + "digit_3")
  private WebElement three;

  @AndroidFindBy(id = ANDROID_PREFIX + "eq")
  private WebElement equal;

  @AndroidFindBy(id = ANDROID_PREFIX + "op_add")
  private WebElement add;

  @AndroidFindBy(id = ANDROID_PREFIX + "result")
  private WebElement result;

  public CalculatorPage() {
    waitFor(visibilityOfAllElements(Arrays.asList(two, three, equal, add, result)));
  }

  public CalculatorPage two() {
    click(two);
    return this;
  }

  public CalculatorPage plus() {
    click(add);
    return this;
  }

  public String is() {
    click(equal);
    return getText(result);
  }

  public CalculatorPage three() {
    click(three);
    return this;
  }

}
