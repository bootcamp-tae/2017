package com.globant.automation.bootcamp.webdriver;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

/**
 * Esta clase contiene todas las operaciones comunes sobre las paginas que se utilizan en los test
 */
public abstract class CommonOperations {

    protected WebDriver getDriver() {
        return Context.INSTANCE.getDriver();
    }

    protected CommonOperations selectByText(WebElement element, String text) {
        waitFor(visibilityOf(element));
        new Select(element).selectByVisibleText(text);
        return this;
    }

    protected CommonOperations selectByValue(WebElement element, String value) {
        waitFor(visibilityOf(element));
        new Select(element).selectByValue(value);
        return this;
    }

    protected CommonOperations selectByIndex(WebElement element, int index) {
        waitFor(visibilityOf(element));
        new Select(element).selectByIndex(index);
        return this;
    }

    protected CommonOperations type(WebElement element, String text) {
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

    /**
     * Me permite establecer cual es la condicion por la cual esperare
     * con un cierto tiempo limite Timeout,
     *
     * @param condition
     * @param <T> tipo de condicion por la cual espero
     */
    protected <T> void waitFor(ExpectedCondition<T> condition) {
        new FluentWait<>(getDriver())
                .withTimeout(60, SECONDS)
                .pollingEvery(1, SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .until(condition);
    }

}
