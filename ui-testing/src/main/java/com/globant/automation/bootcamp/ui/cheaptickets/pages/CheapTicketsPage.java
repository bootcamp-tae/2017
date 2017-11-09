package com.globant.automation.bootcamp.ui.cheaptickets.pages;

import com.globant.automation.bootcamp.webdriver.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Middle ground Page Object for all Cheap Tickets related pages
 */
public class CheapTicketsPage extends Page {

    @FindBy(tagName = "html")
    private WebElement html;

    protected void enterDate(WebElement element, String date) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].value = arguments[1];", element, date);
    }

}
