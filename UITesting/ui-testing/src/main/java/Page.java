import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class Page {

    private final WebDriver driver;

    protected Page(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected WebDriver getDriver() { // Se lo declara protected para que el test no lo pueda acceder y no se exponga
                                      // la tecnología de la clase.
        return driver;
    }

    protected void enterDate(WebElement element, String date){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].value = arguments[1]", element, date);
    }

    protected Page selectFromFromDropText(WebElement element, String value){
        new Select(element).selectByVisibleText(value);
        return this;
    }

    protected Page selectFromFromDropDown(WebElement element, String value){
        new Select(element).selectByValue(value);
        return this;
    }

    protected Page selectFromFromDropDown(WebElement element, int index){
        new Select(element).selectByIndex(index);;
        return this;
    }
}
