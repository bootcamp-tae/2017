package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.Landing;

import com.globant.automation.bootcamp.webDriver.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tabs extends Page {

    @FindBy(id = "tab-hotel-tab")
    private WebElement hotelsTab;

    public Hotels toHotels() {
        click(hotelsTab);
        return new Hotels();
    }
}