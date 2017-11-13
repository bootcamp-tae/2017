package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.Landing;

import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.CheapTicketsComponent;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.CheapTicketsPage;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.LogIn.SignIn;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountMenu extends CheapTicketsPage{
    @FindBy(id = "header-account-signin-button")
    private WebElement signInButton;

    public SignIn goToSinIn(){
        click(signInButton);
        return new SignIn();
    }
}
