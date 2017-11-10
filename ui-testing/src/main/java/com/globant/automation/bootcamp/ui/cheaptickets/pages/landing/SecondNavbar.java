package com.globant.automation.bootcamp.ui.cheaptickets.pages.landing;

import com.globant.automation.bootcamp.webdriver.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondNavbar extends Page {

    @FindBy(id = "tab-hotel-tab")
    private WebElement hotelsTab;

    public HotelForm toHotels() {
        click(hotelsTab);
        return new HotelForm();
    }
}
