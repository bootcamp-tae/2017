package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class LogInPage extends MercadoLibreHome{

    @FindBy(className = "auth-title")
    private List<WebElement> message;

    public String getMessage(){
        waitFor(visibilityOfAllElements(message));
        return getText(message.get(0));
    }
}
