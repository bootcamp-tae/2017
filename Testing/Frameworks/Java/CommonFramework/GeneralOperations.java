package CommonFramework;

import org.openqa.selenium.JavascriptExecutor;
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

public abstract class GeneralOperations {

    protected  abstract WebDriver getDriver();
    protected GeneralOperations click(WebElement element)
    {
        waitFor(elementToBeClickable(element));
        element.click();
        return this;
    }

    protected GeneralOperations select(WebElement element, String text)
    {
        waitFor(elementToBeSelected(element));
        new Select(element).selectByVisibleText(text);
        return this;
    }

    protected GeneralOperations enterDate(WebElement element, String date)
    {
        waitFor(visibilityOf(element));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].value = arguments[1];",element,date);
        return this;
    }

    protected <T> void waitFor(ExpectedCondition<T> condition)
    {
        new FluentWait<>(getDriver())
                .withTimeout(60, SECONDS)
                .pollingEvery(1,SECONDS)
                .ignoring(NoSuchElementException.class)
                .until(condition);
    }
}
