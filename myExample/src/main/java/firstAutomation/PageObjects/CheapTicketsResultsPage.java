package firstAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

/**
 * Created by Facundo on 08/11/2017.
 */
public class CheapTicketsResultsPage extends PageObjectsBase {

    @FindBy(className = "flex-link")
    private List<WebElement> results;

    public CheapTicketsResultsPage(WebDriver browser) {
        super(browser);
    }

    public CheapTicketsOneResult clickOnResultNumber(int index) {
        getWait().until(visibilityOfAllElements(results));
        results.get(index).click();
        return new CheapTicketsOneResult(getBrowser());
    }

}
