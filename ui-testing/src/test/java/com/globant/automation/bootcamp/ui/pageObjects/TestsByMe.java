package com.globant.automation.bootcamp.ui.pageObjects;

import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.AnotherPage;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTicketsHome;
import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.HotelForm;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Created by yo on 8/11/2017.
 */
public class TestsByMe {
    private ChromeDriver driver;

    @BeforeClass
    public static void doOnce() {
        ChromeDriverManager.getInstance().setup();
    }

    @Before
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cheaptickets.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void searchFirstHotelTest(){
        HotelForm hotelForm = new HotelForm("paris", "12/12/2017", "12/28/2017", 0, 0 , 0);
        AnotherPage result = new CheapTicketsHome(driver)
               .clickInHotels()
               .searchHotel(hotelForm)
               .selectFirstResult();
        assertThat("The Hotel name contains", result.getTitle(), containsString("Saint-Germain")); //this is wrong
    }

}
