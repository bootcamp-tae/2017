package com.globant.automation.bootcamp;

import com.globant.automation.bootcamp.webdriver.web.Page;

import java.util.Set;

import static org.openqa.selenium.support.ui.ExpectedConditions.numberOfWindowsToBe;

/**
 * Created by Facundo on 13/11/2017.
 */
public class MercadoLibrePage extends Page {

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
