package com.globant.automation.bootcamp.ui.cheaptickets.pages.landing;

import com.globant.automation.bootcamp.ui.cheaptickets.models.FlightCriteria;
import com.globant.automation.bootcamp.ui.cheaptickets.pages.CheapTicketsPage;
import com.globant.automation.bootcamp.ui.cheaptickets.pages.flights.FlightResults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Flights extends CheapTicketsPage
{
    @FindBy(id = "flight-origin")
    private WebElement flyingFrom;

    @FindBy(id = "flight-destination")
    private WebElement flyingTo;

    @FindBy(id = "flight-departing")
    private WebElement departing;

    @FindBy(id = "flight-returning")
    private WebElement returning;

    @FindBy(id = "flight-adults")
    private WebElement adults;

    @FindBy(id = "flight-children")
    private WebElement children;

    @FindBy(id = "search-button")
    private WebElement btnSearch;

    @FindBy(css = "[data-tid='typeahead-link0']")
    private WebElement firstSuggestion;

    public FlightResults search (FlightCriteria criteria) {
        type(flyingFrom, criteria.getFlyingFrom());
        click(firstSuggestion);
        type(flyingTo, criteria.getFlyingTo());
        enterDate(departing, criteria.getDeparting());
        enterDate(returning, criteria.getReturning());
        selectByText(adults, String.valueOf(criteria.getAdults()));
        selectByText(children, String.valueOf(criteria.getChildren()));
        click(btnSearch);
        return new FlightResults();
    }
}
