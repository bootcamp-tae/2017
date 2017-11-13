package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.Landing;

import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.Models.HotelForm;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.CheapTicketsPage;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.Hotels.HotelResults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hotels extends CheapTicketsPage {

    @FindBy(id = "hotel-destination")
    private WebElement destination;

    @FindBy(id = "hotel-checkin")
    private WebElement checkIn;

    @FindBy(id = "hotel-checkout")
    private WebElement checkOut;

    @FindBy(id = "hotel-rooms")
    private WebElement rooms;

    @FindBy(id = "hotel-1-adults")
    private WebElement adults;

    @FindBy(id = "hotel-1-children")
    private WebElement children;

    @FindBy(id = "search-button")
    private WebElement search;

    @FindBy(css = "[data-tid='typeahead-link0']")
    private WebElement firstSuggestion;


    public HotelResults search(HotelForm criteria) {
        type(destination, criteria.getDestination());
        click(firstSuggestion);
        enterDate(checkIn, criteria.getCheckIn());
        enterDate(checkOut, criteria.getCheckOut());
        selectByText(rooms, String.valueOf(criteria.getRooms()));
        selectByText(adults, String.valueOf(criteria.getAdults()));
        selectByText(children, String.valueOf(criteria.getChildren()));
        click(search);
        return new HotelResults();
    }
}