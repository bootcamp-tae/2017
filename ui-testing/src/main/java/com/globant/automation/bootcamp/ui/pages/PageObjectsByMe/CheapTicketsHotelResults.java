package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe;

import com.globant.automation.bootcamp.ui.pages.AnotherPage;
import com.globant.automation.bootcamp.ui.pages.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by yo on 8/11/2017.
 */
public class CheapTicketsHotelResults extends Page{

    @FindBy(css = ".cf flex-1up flex-listing flex-theme-light cols-nested")
    private List<WebElement> results;

    CheapTicketsHotelResults(WebDriver driver) {
        super(driver);
    }

    public AnotherPage selectFirstResult(){
        results.get(0).click();

        return new AnotherPage(getDriver());
    }
}
