package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.Landing;

import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.CheapTicketsComponent;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrimarySiteHeader extends CheapTicketsPage{
    @FindBy(id = "header-account-menu")
    private WebElement headAccountMenu;



    public AccountMenu openAccountMenu(){
      click(headAccountMenu);
      return new AccountMenu();
    }
}
