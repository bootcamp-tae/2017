package mercadolibre.pages;

import com.globant.automation.bootcamp.webdriver.web.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class Register extends Page{

    @FindBy(className = "auth-title")
    private List<WebElement> messages;

    public String getMessage(){
        waitFor(visibilityOfAllElements(messages));
        return getText(messages.get(0));
    }
}
