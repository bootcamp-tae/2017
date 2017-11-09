package bootcamp;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;


public abstract class PageBase {

    private final WebDriver driver;
    private final WebDriverWait wait;

    protected PageBase(WebDriver driver){
        this.driver=driver;
        long timeout=60;
        this.wait=new WebDriverWait(driver,timeout);
        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver(){
        return this.driver;
    }

    protected WebDriverWait getWait(){
        return this.wait;
    }

    public  void enterData(WebElement element, String date){
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].value = arguments[1];",element,date);
    }

}
