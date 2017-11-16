package com.globant.automation.bootcamp.ui.pageObjects;

import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.Landing.Home;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.LogIn.SignIn;
import com.globant.automation.bootcamp.webDriver.Web.WebTest;
import org.junit.Test;

import static org.junit.Assert.assertThat;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class TestsByMe extends WebTest<Home> {

    @Test
    public void wrongCretentialsLogin() {
        SignIn signIn = getInitialPage()
                .primarySiteHeader()
                .openAccountMenu()
                .goToSinIn()
                .trySignIn("not an email", "a password");

        assertThat("The error message is displayed", signIn.getWrongCretenalsError(), not(isEmptyOrNullString()));
    }

    @Override
    protected Home getInitialPage() {
        return new Home();
    }

    @Override
    protected String getInitialUrl() {
        return "https://www.cheaptickets.com/";
    }
}
