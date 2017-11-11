package bootcamp.pages.landing;

import bootcamp.model.FlightBuilder;
import bootcamp.pages.CheapTicketsPage;
import bootcamp.pages.components.Flights.FlightResults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flights extends CheapTicketsPage{

    @FindBy(id="flight-type-one-way-label")
    private WebElement btnOneWatFlight;

    @FindBy(id="flight-origin")
    private WebElement inputOrigin;

    @FindBy(id="flight-destination")
    private WebElement inputDestination;

    @FindBy(id="flight-departing")
    private WebElement inputDateDeparting;

    @FindBy(id="flight-adults")
    private WebElement inputAdults;

    @FindBy(id="flight-children")
    private WebElement inputChildrens;

    @FindBy(id="search-button")
    private WebElement searchBtn;

    public FlightResults search(FlightBuilder builder){
        click(btnOneWatFlight);
        type(inputOrigin, builder.getOrigin());
        type(inputDestination, builder.getDestination());
        enterDate(inputDateDeparting, builder.getDateDeparting());
        selectByText(inputAdults, String.valueOf(builder.getAdults()));
        selectByText(inputChildrens, String.valueOf(builder.getChildren()));
        click(searchBtn);
        return new FlightResults();
    }

}
