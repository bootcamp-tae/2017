package firstAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

/**
 * Created by Facundo on 08/11/2017.
 */
public class CheapTicketsOneResult extends PageObjectsBase{

    @FindBy(className = "page-content")
    private WebElement pageContent;

    public CheapTicketsOneResult(WebDriver browser) {
        super(browser);
    }

    public CheapTicketsOneResult seeResult() {
        getWait().until(visibilityOf(pageContent));
        return this;
    }
}
