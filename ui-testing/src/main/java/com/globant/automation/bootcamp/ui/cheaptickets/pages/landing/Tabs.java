package com.globant.automation.bootcamp.ui.cheaptickets.pages.landing;

import com.globant.automation.bootcamp.webdriver.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tabs extends Page {

    @FindBy(id = "tab-hotel-tab")
    private WebElement hotelsTab;

    @FindBy(id = "tab-flight-tab")
    private WebElement flightsTab;

    public Hotels toHotels() {
        click(hotelsTab);
        return new Hotels();
    }

    public Flights toFlights() {
        click(flightsTab);
        return new Flights();
    }
}
