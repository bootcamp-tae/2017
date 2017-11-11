package bootcamp.pages;

import bootcamp.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class CheapTicketsOpenLink extends PageBase {

    @FindBy(className = "toggle-banner")
    private WebElement banner;

    public CheapTicketsOpenLink(WebDriver driver){
        super(driver);
    }

    public CheapTicketsOpenLink loadResult() {
        getWait().until(visibilityOf(banner));
        return this;
    }


}
