import WebDriver.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheapTicketHome extends Page {

    Tabs tabs;

    public CheapTicketHome(){
        super();
        //getDriver().get("https://www.cheaptickets.com/");
    }

    public Tabs getTabBar(){
        return this.tabs;
    }

}
