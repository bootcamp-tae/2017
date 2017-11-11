package bootcamp.Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public abstract class PageBase {


    protected WebDriver getDriver(){
       return ContextDriver.INSTANCE.getDriver();
    }

    protected PageBase selectByText(WebElement element, String text) {
        waitFor(visibilityOf(element));
        new Select(element).selectByVisibleText(text);
        return this;
    }

    protected PageBase selectByValue(WebElement element, String value) {
        waitFor(visibilityOf(element));
        new Select(element).selectByValue(value);
        return this;
    }

    protected PageBase selectByIndex(WebElement element, int index) {
        waitFor(visibilityOf(element));
        new Select(element).selectByIndex(index);
        return this;
    }

    protected PageBase type(WebElement element, String text) {
        waitFor(visibilityOf(element));
        element.sendKeys(text);
        return this;
    }

    protected void click(WebElement element) {
        waitFor(visibilityOf(element));
        element.click();
    }

    protected String getText(WebElement element) {
        waitFor(visibilityOf(element));
        return element.getText();
    }

    public  void enterData(WebElement element, String date){
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].value = arguments[1];",element,date);
    }

    protected <T> void waitFor(ExpectedCondition<T> condition){
        new FluentWait<>(getDriver())
                .withTimeout(60, SECONDS)
                .pollingEvery(1, SECONDS)
                .ignoring(NoSuchElementException.class)
                .until(condition);
    }
}
