package com.globant.automation.bootcamp.ui.pages.hotels;

import com.globant.automation.bootcamp.ui.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheapTicketHotelTab extends CheapTicketsPage{

    @FindBy(id = "hotel-destination")
    private WebElement hotelDestination;

    @FindBy(id = "hotel-checkin")
    private WebElement checkInDate;

    @FindBy(id = "hotel-checkout")
    private WebElement checkOutDate;

    @FindBy(id = "hotel-rooms")
    private WebElement hotelRooms;

    @FindBy(id = "hotel-1-adults")
    private WebElement adultsPassengers;

    @FindBy(id = "hotel-1-children")
    private WebElement childrenPassengers;

    @FindBy(id = "search-button")
    private WebElement searchButton;

    public void getHotels
}
