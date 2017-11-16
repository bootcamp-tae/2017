package com.globant.automation.bootcamp.ui.cheaptickets.pages;

import com.globant.automation.bootcamp.webdriver.web.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

/**
 * Middle ground Page Object for all Cheap Tickets related pages
 */
public class CheapTicketsPage extends Page {

    protected void enterDate(WebElement element, String date) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].value = arguments[1];", element, date);
    }

    protected void changeTab() {
        waitFor(numberOfWindowsToBe(2));
        String currentTab = getDriver().getWindowHandle();
        Set<String> tabs = getDriver().getWindowHandles();
        for(String tab : tabs){
            if(!tab.equals(currentTab)){
                getDriver().switchTo().window(tab);
                break;
            }
        }
    }

}
