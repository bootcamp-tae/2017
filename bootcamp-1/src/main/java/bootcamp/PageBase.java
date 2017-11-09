package bootcamp;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.FluentWait;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;


public abstract class PageBase {

    private final WebDriver driver;

    protected PageBase(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver(){
        return this.driver;
    }

    public  void enterData(WebElement element, String date){
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].value = arguments[1];",element,date);
    }

}
