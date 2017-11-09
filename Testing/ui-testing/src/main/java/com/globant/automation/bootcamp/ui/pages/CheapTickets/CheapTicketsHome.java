package com.globant.automation.bootcamp.ui.pages.CheapTickets;

import com.globant.automation.bootcamp.ui.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheapTicketsHome extends Page {

    @FindBy(id = "tab-hotel-tab")
    private WebElement hotelTab;

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


    public CheapTicketsHome(WebDriver driver){
        super(driver);
    }

    public CheapTicketsResults searchHotels(HotelSearch hotelSearch){

        hotelTab.click();
        hotelDestination.sendKeys(hotelSearch.getDestination());
        enterDate(checkInDate, hotelSearch.getCheckInDate());
        enterDate(checkOutDate, hotelSearch.getCheckOutDate());
        selectFromDropDownText(hotelRooms, String.valueOf(hotelSearch.getRooms()));
        selectFromDropDownText(adultsPassengers, String.valueOf(hotelSearch.getAdultPassengers()));
        selectFromDropDownText(childrenPassengers, String.valueOf(hotelSearch.getChildrenPassengers()));
        searchButton.click();
        return new CheapTicketsResults(getDriver());
    }
}
