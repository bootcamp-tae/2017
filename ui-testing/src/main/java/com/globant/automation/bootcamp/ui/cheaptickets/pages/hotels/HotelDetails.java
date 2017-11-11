package com.globant.automation.bootcamp.ui.cheaptickets.pages.hotels;

import com.globant.automation.bootcamp.ui.cheaptickets.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelDetails extends CheapTicketsPage {

    @FindBy(id = "mock-book-button")
    WebElement topReserveButton;

    @FindBy(xpath = "//*[@id=\"rooms-and-rates\"]/div/article/table/tbody[1]/tr/td[4]/div/div[1]/button")
    WebElement realReserveButton;

    public HotelDetails clickOnTopReserveButton() {
        changeTab();
        click(topReserveButton);
        return this;
    }

    public MakeReserveModal clickOnRealReserveButton() {
        click(realReserveButton);
        return new MakeReserveModal();
    }



}
