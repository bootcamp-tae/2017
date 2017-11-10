package WebDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;


import java.util.NoSuchElementException;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeSelected;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

abstract class CommonWebOps {

    protected WebDriver getDriver(){
        return Context.INSTANCE.getDriver();
    }

    protected CommonWebOps click(WebElement element){
        waitFor(elementToBeClickable(element));
        element.click();
        return this;
    }

    protected CommonWebOps Type(String text , WebElement element){
        waitFor(visibilityOf(element));
        element.sendKeys(text);
    }

    protected CommonWebOps selectByValue(WebElement element, String value){
        waitFor(elementToBeSelected(element));
        new Select(element).selectByValue(value);
        return this;
    }

    protected CommonWebOps selectByIndex(WebElement element, int index){
        waitFor(elementToBeSelected(element));
        new Select(element).selectByIndex(index);
        return this;
    }

    protected CommonWebOps selectByVisibleText(WebElement element, String text){
        waitFor(elementToBeSelected(element));
        new Select(element).selectByVisibleText(text);
        return this;
    }

    protected String getText(WebElement element){
        waitFor(visibilityOf(element));
        return element.getText();
    }

    public CommonWebOps enterDate(WebElement element, String date){
        ((JavascriptExecutor) getDriver()).executeScript ( "arguments[0].value = arguments[1];", element, date );
        return this;
    }

    protected <T> void waitFor(ExpectedCondition<T> condition){
        new FluentWait<>(getDriver())
                .withTimeout(60, SECONDS)
                .pollingEvery(1, SECONDS)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .until(condition);
    }

}
