import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheapTicketsHome extends Page
{
    @FindBy(id = "tab-hotel-tab")
    private WebElement tabHotel;

    @FindBy(id = "hotel-destination")
    private WebElement destination;

    @FindBy(id = "hotel-checkin")
    private WebElement dateCheckIn;

    @FindBy(id = "hotel-checkout")
    private WebElement dateCheckOut;

    @FindBy(id = "hotel-rooms")
    private WebElement rooms;

    @FindBy(id = "hotel-1-adults")
    private WebElement adults;

    @FindBy(id = "hotel-1-children")
    private WebElement children;

    @FindBy(id = "search-button")
    private WebElement searchButton;

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
