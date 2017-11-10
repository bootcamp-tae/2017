package com.globant.automation.bootcamp.ui.pages.hotels;

import org.openqa.selenium.WebDriver;

public class CheapTicketsHotelsResults extends Component {

    public CheapTicketsHotelsResults(WebDriver driver){
        super(driver);
    }

    public CheapTicketsHotelsResults selectResult(int resultIndex){
        return this;
    }
}
