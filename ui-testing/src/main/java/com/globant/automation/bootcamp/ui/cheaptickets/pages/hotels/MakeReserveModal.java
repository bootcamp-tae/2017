package com.globant.automation.bootcamp.ui.cheaptickets.pages.hotels;

import com.globant.automation.bootcamp.ui.cheaptickets.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Facundo on 10/11/2017.
 */
public class MakeReserveModal extends CheapTicketsPage {

    @FindBy(id = "modalCloseButton")
    WebElement modalCloseButton;

    public HotelDetails closeModal() {
        click(modalCloseButton);
        return new HotelDetails();
    }



}
