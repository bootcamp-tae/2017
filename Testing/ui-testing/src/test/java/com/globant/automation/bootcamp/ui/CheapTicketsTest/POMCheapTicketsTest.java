package com.globant.automation.bootcamp.ui.CheapTicketsTest;

import com.globant.automation.bootcamp.ui.pages.CheapTicketsHome;
import com.globant.automation.bootcamp.ui.models.HotelSearch;
import com.globant.automation.bootcamp.ui.pages.hotels.CheapTicketsHotelsResults;
import com.globant.automation.bootcamp.webdriver.WebTest;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMCheapTicketsTest extends WebTest<CheapTicketsHome>{

    @Test
    public void testSample() {
        CheapTicketsHotelsResults hotel = getInitialPage()
                .getTabsBar()
                .searchHotels();
    }

    @Override
    protected CheapTicketsHome getInitialPage() {
        return new CheapTicketsHome();
    }

    @Override
    protected String getInitialUrl() {
        return "https://www.cheaptickets.com/";
    }

}
