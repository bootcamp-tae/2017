package firstAutomation.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Facundo on 08/11/2017.
 */
public abstract class PageObjectsBase {

    private static final int TIMEOUT_IN_SECONDS = 60;

    private final WebDriver browser;
    private final WebDriverWait wait;

    public PageObjectsBase(WebDriver browser) {
        this.browser = browser;
        this.wait = new WebDriverWait(browser, TIMEOUT_IN_SECONDS);
        PageFactory.initElements(browser, this);
    }

    protected WebDriver getBrowser() {
        return browser;
    }

    protected WebDriverWait getWait() {
        return wait;
    }

    protected void enterDate(WebElement element, String date) {
        ((JavascriptExecutor)getBrowser()).executeScript("arguments[0].value=arguments[1];", element, date);
    }

}
