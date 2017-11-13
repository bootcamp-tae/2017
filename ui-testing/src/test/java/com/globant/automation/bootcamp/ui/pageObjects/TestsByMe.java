package com.globant.automation.bootcamp.ui.pageObjects;

import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.Models.HotelForm;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.Models.HotelForm;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.Hotels.HotelCard;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.Landing.Home;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.LogIn.SignIn;
import com.globant.automation.bootcamp.webDriver.WebTest;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.Models.HotelForm.Builder.aHotelCriteria;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

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
