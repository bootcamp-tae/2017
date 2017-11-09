import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheapTicketsHome extends Page
{
    @FindBy(id = "tab-hotel-tab")
    public WebElement tabHotel;

    @FindBy(id = "hotel-destination")
    public WebElement destination;

    @FindBy(id = "hotel-checkin")
    public WebElement dateCheckIn;

    @FindBy(id = "hotel-checkout")
    public WebElement dateCheckOut;

    @FindBy(id = "hotel-rooms")
    public WebElement rooms;

    @FindBy(id = "hotel-1-adults")
    public WebElement adults;

    @FindBy(id = "hotel-1-children")
    public WebElement children;

    @FindBy(id = "search-button")
    public WebElement searchButton;

    protected CheapTicketsHome(WebDriver driver) {
        super(driver);
    }

    public CheapTicketsResults searchHotels(Search s){
        tabHotel.click();
        destination.sendKeys(s.getCityDestination());
        this.enterDate(dateCheckIn, s.getDateCheckIn());
        this.enterDate(dateCheckOut, s.getDateCheckOut());
        this.selectFromFromDropDown(rooms, s.getRooms());
        this.selectFromFromDropDown(adults, s.getAdults());
        this.selectFromFromDropDown(children, s.getChildren());
        this.searchButton.click();
        return new CheapTicketsResults(getDriver());
    }
}
