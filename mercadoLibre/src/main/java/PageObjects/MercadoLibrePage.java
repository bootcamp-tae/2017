package PageObjects;

import PageObjects.Landing.NavBound;
import com.globant.automation.bootcamp.webDriver.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public abstract class MercadoLibrePage extends Page {
    @FindBy(tagName = "html")
    private WebElement html;

    @FindBy(tagName = "header")
    private WebElement header;

    private final NavBound navBound = new NavBound(header);

    public NavBound inNavigationBar() {
        waitFor(visibilityOf(header));
        return navBound;
    }
}
