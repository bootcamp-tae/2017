package com.globant.automation.bootcamp.ui.cheaptickets.pages.hotels;

import com.globant.automation.bootcamp.ui.cheaptickets.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelDetails extends CheapTicketsPage {

    @FindBy(id = "mock-book-button")
    WebElement topReserveButton;

    @FindBy(css = "[data-automation=\"launchETPModal\"]")
    WebElement realReserveButton;

    public HotelDetails clickOnTopReserveButton() {
        click(topReserveButton);
        return this;
    }

    public MakeReserveModal clickOnRealReserveButton() {
        click(realReserveButton);
        return new MakeReserveModal();
    }

}
