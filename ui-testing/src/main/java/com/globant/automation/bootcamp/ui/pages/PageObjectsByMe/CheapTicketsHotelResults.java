package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

/**
 * Created by yo on 8/11/2017.
 */
public class CheapTicketsHotelResults extends Page{

    @FindBy(className = "flex-link")
    private List<WebElement> results;

    CheapTicketsHotelResults(WebDriver driver) {
        super(driver);
    }

    public AnotherPage selectFirstResult(){
        getWait().until(visibilityOfAllElements(results));
        results.get(0).click();
        return new AnotherPage(getDriver());
    }
}
