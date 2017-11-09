import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract  class InitialPage {

    private WebDriver driver;

    public InitialPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    protected WebDriver getDriver(){
        return this.driver;
    }

    public void enterDate(WebElement element, String date){
        ((JavascriptExecutor) getDriver()).executeScript ( "arguments[0].value = arguments[1];", element, date );
    }

}
