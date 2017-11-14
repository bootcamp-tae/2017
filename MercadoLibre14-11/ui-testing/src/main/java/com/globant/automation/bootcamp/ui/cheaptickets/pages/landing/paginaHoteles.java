package com.globant.automation.bootcamp.ui.cheaptickets.pages.landing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.globant.automation.bootcamp.ui.cheaptickets.pages.CheapTicketsPage;

public class paginaHoteles extends CheapTicketsPage {

    @FindBy(id = "star3")
    private WebElement estrellas;

    @FindBy(xpath = "//*[@id='sortContainer']/div/div/div[2]/div/fieldset/ul/li[3]/button")
    private WebElement precio;

    @FindBy(xpath = "//*[@id='16617843']")
    private WebElement hotel;

    public void seleccionarEstrellas() {
	click(estrellas);
    }

    public void seleccionarPrecio() {
	click(precio);
    }

    public void seleccionarHotel() {
	click(hotel);
    }

}
