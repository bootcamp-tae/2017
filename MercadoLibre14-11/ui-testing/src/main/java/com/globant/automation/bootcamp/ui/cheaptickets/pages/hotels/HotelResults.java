package com.globant.automation.bootcamp.ui.cheaptickets.pages.hotels;

import static java.util.stream.Collectors.toList;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.globant.automation.bootcamp.ui.cheaptickets.pages.CheapTicketsPage;

public class HotelResults extends CheapTicketsPage {

    @FindBy(css = "[data-automation='organic']")
    private List<WebElement> hotels;

    @FindBy(id = "star3")
    private WebElement estrellas;

    @FindBy(xpath = "//*[@id='sortContainer']/div/div/div[2]/div/fieldset/ul/li[3]/button")
    private WebElement precio;

    public void seleccionarEstrellas() {
	click(estrellas);
    }

    public void seleccionarPrecio() {
	click(precio);
    }

    public List<HotelCard> getHotels() {
	// seleccionarEstrellas();
	seleccionarPrecio();
	waitFor(visibilityOfAllElements(hotels));
	return hotels.stream().map(HotelCard::new).collect(toList());
    }

}
