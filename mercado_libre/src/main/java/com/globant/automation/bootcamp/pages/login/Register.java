package com.globant.automation.bootcamp.pages.login;

import com.globant.automation.bootcamp.webdriver.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Facundo on 13/11/2017.
 */
public class Register extends Page {

    @FindBy(id = "signupEmail")
    private WebElement signUpEmail;

    public Register writeEmail(String email){
        sendKeys(signUpEmail, email);
        return this;
    }

}
