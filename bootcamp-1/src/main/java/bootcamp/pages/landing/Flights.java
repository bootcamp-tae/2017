package bootcamp.pages.landing;

import bootcamp.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flights extends CheapTicketsPage{

    @FindBy(id="flight-type-one-way-label")
    private WebElement btnOneWatFlight;

}
