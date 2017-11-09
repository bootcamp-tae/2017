import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class CheapTicketHome extends InitialPage {

    @FindBy(id = "tab-hotel-tab")
    WebElement hotelButton;

    @FindBy(id = "search-button")
    WebElement searchButton;

    public CheapTicketHome(){
        super(new FirefoxDriver());
        getDriver().get("https://www.cheaptickets.com/");
    }

    public HotelView SelectHotels() {
        hotelButton.click();
        return new HotelView(getDriver());
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
