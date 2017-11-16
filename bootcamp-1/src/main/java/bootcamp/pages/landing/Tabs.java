package bootcamp.pages.landing;

import components.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tabs extends Page {

    @FindBy(id = "tab-hotel-tab")
    private WebElement hotelBtn;

    @FindBy(id="tab-flight-tab")
    private WebElement flightBtn;

    public Hotels toHotels() {
        click(hotelBtn);
        return new Hotels();
    }

    public Flights toFlights(){
        click(flightBtn);
        return new Flights();
    }
}
