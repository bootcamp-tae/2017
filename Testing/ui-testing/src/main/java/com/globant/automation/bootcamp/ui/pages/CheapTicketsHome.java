package com.globant.automation.bootcamp.ui.pages;

import com.globant.automation.bootcamp.ui.models.HotelSearch;
import com.globant.automation.bootcamp.ui.pages.hotels.CheapTicketsHotelsResults;
import com.globant.automation.bootcamp.webdriver.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheapTicketsHome extends CheapTicketsPage {



    private CheapTicketsTabs tabsBar = new CheapTicketsTabs();

    public CheapTicketsTabs getTabsBar() {
        return tabsBar;
    }
}
