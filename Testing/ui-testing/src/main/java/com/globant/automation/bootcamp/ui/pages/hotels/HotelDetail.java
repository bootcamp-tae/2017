package com.globant.automation.bootcamp.ui.pages.hotels;

import com.globant.automation.bootcamp.ui.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelDetail extends CheapTicketsPage {

    @FindBy(id = "hotel-name")
    private WebElement hotelName;

    @FindBy(css = "price link-to-rooms")
    private WebElement hotelPricePerNight;

    //Check if there is a better identificator
    @FindBy(xpath = "/html/body/div[3]/div[8]/section/section/div[2]/article/div/div[2]/div[2]/span[1]")
    private WebElement hotelRating;

    public String getName(){
        return getText(hotelName);
    }

    public double getPricePerNight(){
        return Double.parseDouble(getText(hotelPricePerNight));
    }

    public double getHotelRating() {
        return Double.parseDouble(getText(hotelRating));
    }
}
