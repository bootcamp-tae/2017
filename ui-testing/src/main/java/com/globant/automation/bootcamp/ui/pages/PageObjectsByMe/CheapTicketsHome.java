package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe;

import com.globant.automation.bootcamp.ui.pages.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by yo on 8/11/2017.
 */
public class CheapTicketsHome extends Page {

    @FindBy(id = "tab-hotel-tab")
    private WebElement hotelIcon;

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
    private WebElement searchButton;

    public CheapTicketsHome(WebDriver driver) {
        super(driver);
    }

    public CheapTicketsHome clickInHotels(){
        hotelIcon.click();
        return this;
    }

    public void enterDate(WebElement element, String date){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].value = arguments[1]", element, date);
    }

    public CheapTicketsHotelResults searchHotel(HotelForm hotelForm){
        Select roomsSelect = new Select(rooms);
        Select adultsSelect = new Select(adults);
        Select childrenSelect = new Select(children);

        destination.sendKeys(hotelForm.getDestination());
        this.enterDate(checkIn, hotelForm.getCheckIn());
        this.enterDate(checkOut, hotelForm.getChekOut());
        roomsSelect.selectByIndex(hotelForm.getRooms());
        adultsSelect.selectByIndex(hotelForm.getAdults());
        childrenSelect.selectByIndex(hotelForm.getChildren());
        searchButton.click();
        return new CheapTicketsHotelResults(getDriver());
    }
}
