package GriPageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {
    private final WebDriver driver;

    protected Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }

    public void enterDate(WebElement element, String date)
    {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].value = arguments[1];",element,date);
    }

}
