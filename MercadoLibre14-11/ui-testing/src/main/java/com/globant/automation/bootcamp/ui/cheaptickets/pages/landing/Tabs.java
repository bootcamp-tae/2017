package com.globant.automation.bootcamp.ui.cheaptickets.pages.landing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.globant.automation.bootcamp.webdriver.Page;

public class Tabs extends Page {

    @FindBy(id = "tab-hotel-tab")
    private WebElement hotelsTab;

    public Hotels toHotels() {
	click(hotelsTab);
	return new Hotels();
    }

    public Hotels irAHoteles() {
	click(hotelsTab);
	return new Hotels();
    }
}
