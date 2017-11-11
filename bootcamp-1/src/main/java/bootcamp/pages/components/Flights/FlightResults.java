package bootcamp.pages.components.Flights;

import bootcamp.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class FlightResults extends CheapTicketsPage {

    @FindBy(id="flightModuleList")
    private List<WebElement> flights;

    public List<FlightCard> getFlights() {
        waitFor(visibilityOfAllElements(flights));
        return flights.stream().map(FlightCard::new).collect(toList());
    }
}
