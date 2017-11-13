package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.LogIn;

import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends CheapTicketsPage{
    @FindBy(id = "signin-loginid")
    private WebElement emailInput;

    @FindBy(id = "signin-password")
    private WebElement passwordInput;

    @FindBy(id = "submitButton")
    private WebElement signInButton;

    @FindBy(id = "wrong-credentials-error-div")
    private WebElement wrongCedentialsError;

    public SignIn trySignIn(String email, String password){
        type(emailInput, email );
        type(passwordInput, password);
        click(signInButton);
        return this;
    }

    public String getWrongCretenalsError(){
        return getText(wrongCedentialsError);
    }
}
