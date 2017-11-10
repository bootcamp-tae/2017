package com.globant.automation.bootcamp.ui.pageObjects;

import com.globant.automation.bootcamp.ui.pages.Page;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class cheapTicketsHome extends Page {

    @FindBy(id="tab-hotel-tab")
    private WebElement btnHotel;

    @FindBy(id = "hotel-destination")
    private WebElement enterHotelPlace;

    @FindBy (id = "hotel-checkin")
    private WebElement btnChckIn;

    @FindBy (id = "hotel-checkout")
    private WebElement btnChckOut;

    @FindBy (id = "hotel-rooms")
    private WebElement enterRooms;

    @FindBy (id = "hotel-1-adults")
    private WebElement enterAdults;

    @FindBy (id = "search-button")
    private WebElement Search;

    @FindBy(id= "tab-flight-tab")
    private WebElement btnFlight;

    @FindBy(id = "flight-origin")
    private  WebElement enterFlying;

    @FindBy(id="flight-destination")
    private WebElement enterFlyingTo;

    @FindBy(id = "flight-departing")
    private WebElement enterDeparting;

    @FindBy (id = "flight-adults")
    private WebElement enterFlightAdults;

    @FindBy (id="search-button")
    private WebElement enterSearchTab;

    @FindBy (id = "flight-departing")
    private WebElement btnenterDate;

    @FindBy(id = "flight-returning")
    private WebElement btnenterReturning;




    public cheapTicketsHome(WebDriver driver){
        super(driver);
    }

    /////////////////////////////////////////////////////////////

    public cheapTicketsHome goToHotelsTab() {
        btnHotel.click();
        return this;
    }

    public cheapTicketsHome enterHotelPlace(String s) {
        enterHotelPlace.sendKeys(s);
        return this;
    }

    public cheapTicketsHome enterCheckIn(String s) {
        enterDate(this.btnChckIn, s);
        return this;
    }

    public cheapTicketsHome enterCheckOut(String s) {
        enterDate(this.btnChckOut, s);
        return this;
    }

    public cheapTicketsHome enterRooms(String s) {
        new Select(enterRooms).selectByVisibleText(s);
        return  this;
    }

    public cheapTicketsHome enterAdults(String s) {
        new Select(enterAdults).selectByVisibleText(s);
        return this;
    }

    public cheapTicketsHome goToSearchTabH() {
        Search.click();
        return this;
    }



















    ///////////////////////////////////////////////////////////////////////////
    public cheapTicketsHome goToFlightTab() {
        btnFlight.click();
        return this;
    }

    public cheapTicketsHome enterFlying(String s) {
        enterFlying.sendKeys(s + Keys.ENTER);

        return this;
    }

    public cheapTicketsHome enterFlyingTo(String s) {
        enterFlyingTo.sendKeys(s + Keys.ENTER);
        return this;
    }

    public cheapTicketsHome enterFlightDeparture(String s){
        enterDate(this.btnenterDate, s);
        return this;
    }

    public cheapTicketsHome enterFlightReturning(String s){
        enterDate(this.btnenterReturning, s);
        return this;
    }

    public cheapTicketsHome enterFlightAdults(String s) {
        new Select(enterFlightAdults).selectByVisibleText(s);
        //enterFlightAdults.sendKeys(s + Keys.ENTER);
        return this;
    }

    public cheapTicketsHome enterSearchTab() {
        enterSearchTab.click();
        return  this;
    }



}
