import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheapTicketHome extends InitialPage {

    @FindBy(id = "tab-hotel-tab")
    WebElement hotelButton;

    public CheapTicketHome(WebDriver driver){
        super(driver);
        getDriver().get("https://www.cheaptickets.com/");
    }

    public HotelView SelectHotels() {
        hotelButton.click();
        return new HotelView(getDriver());
    }

}
