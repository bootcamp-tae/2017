package com.globant.automation.bootcamp.pages.login;

import com.globant.automation.bootcamp.webdriver.web.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Facundo on 13/11/2017.
 */
public class AreYouNew extends Page {

    @FindBy(id = "registration-link")
    private WebElement imNew;

    public Register sayImNew() {
        click(imNew);
        return new Register();
    }

}
