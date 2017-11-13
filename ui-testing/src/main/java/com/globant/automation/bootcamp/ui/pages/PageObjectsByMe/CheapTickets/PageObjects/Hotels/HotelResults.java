package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.Hotels;

import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class HotelResults extends CheapTicketsPage {

    @FindBy(css = "[data-automation='organic']")
    private List<WebElement> hotels;

    public List<HotelCard> getHotels() {
        waitFor(visibilityOfAllElements(hotels));
        return hotels.stream().map(HotelCard::new).collect(toList());
    }

}