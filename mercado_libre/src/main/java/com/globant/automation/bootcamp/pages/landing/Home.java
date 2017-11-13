package com.globant.automation.bootcamp.pages.landing;

import com.globant.automation.bootcamp.MercadoLibrePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Facundo on 13/11/2017.
 */
public class Home extends MercadoLibrePage{

    @FindBy(tagName = "header")
    private WebElement navbarContainer;

    private final Navbar navbar;

    public Home() {
        this.navbar = new Navbar(navbarContainer);
    }

    public Navbar navbar() {
        return navbar;
    }

}
