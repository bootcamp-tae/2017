package com.globant.automation.bootcamp.ui.pages.CheapTickets;

import com.globant.automation.bootcamp.ui.pages.Page;
import org.openqa.selenium.WebDriver;

public class CheapTicketsResults extends Page {

    public CheapTicketsResults(WebDriver driver){
        super(driver);
    }

    public CheapTicketsResults selectResult(int resultIndex){
        return this;
    }
}
