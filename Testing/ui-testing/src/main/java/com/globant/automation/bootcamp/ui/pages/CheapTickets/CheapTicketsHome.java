package com.globant.automation.bootcamp.ui.pages.CheapTickets;

import com.globant.automation.bootcamp.ui.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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

    public CheapTicketsResults searchHotels(Search search){

        hotelTab.click();
        hotelDestination.sendKeys(search.getCityDestination());
        enterDate(checkInDate, search.getCheckInDate());
        enterDate(checkOutDate, search.getCheckOutDate());
        selectFromDropDown(hotelRooms, search.getRooms());
        selectFromDropDown(adultsPassengers, search.getAdultPassengers());
        selectFromDropDown(childrenPassengers, search.getChildrenPassengers());
        searchButton.click();
        return new CheapTicketsResults(getDriver());
    }
}
