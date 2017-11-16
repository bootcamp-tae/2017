package com.globant.automation.bootcamp.ui.pages;

import com.globant.automation.bootcamp.ui.pages.hotels.CheapTicketHotelTab;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheapTicketsTabs extends CheapTicketsPage {

    @FindBy(id = "tab-hotel-tab")
    private WebElement hotelTab;

    @FindBy(id = "tab-flight-tab")
    private WebElement flightTab;

    @FindBy(id = "tab-car-tab")
    private WebElement carsTab;

    @FindBy(id = "tab-cruise-tab")
    private WebElement cruisesTab;

    public CheapTicketHotelTab toHotels(){
        click(hotelTab);
        return new CheapTicketHotelTab();
    }
}
