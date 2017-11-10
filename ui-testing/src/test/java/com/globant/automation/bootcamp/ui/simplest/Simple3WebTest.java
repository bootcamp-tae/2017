package com.globant.automation.bootcamp.ui.simplest;

import com.globant.automation.bootcamp.ui.pageObjects.cheapTicketsHome;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

import java.util.List;

import static java.lang.Thread.sleep;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class Simple3WebTest {

    private static final By GOOGLE_SEARCH_TEXT_BOX = By.id("lst-ib");
    private static final By GOOGLE_RESULT_LINKS = By.xpath("//h3[@class='r']");
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

    /*@Test
    public void simpleTestVersion2() {
        WebElement searchBox = driver.findElement(GOOGLE_SEARCH_TEXT_BOX);
        searchBox.sendKeys("Buscame algo" + Keys.ENTER);
        List<WebElement> results = driver.findElements(GOOGLE_RESULT_LINKS);
        results.get(5).click();
        assertThat("Page contains text", driver.getTitle(), containsString("BUSCAME"));
    }*/

    @Test
    public void Hoteltest(){
        cheapTicketsHome home = new cheapTicketsHome(driver);
        home.goToHotelsTab()
                .enterHotelPlace("Mar del Plata")
                .enterCheckIn("12/12/2017")
                .enterCheckOut("12/12/2017")
                .enterRooms("2")
                .enterAdults("4")
                .goToSearchTabH();
     }



    @Test
    public void FlightTest(){
        cheapTicketsHome home = new cheapTicketsHome(driver);
        home.goToFlightTab().enterFlying("Mar del plata").enterFlyingTo("ezeiza")
            .enterFlightDeparture("12/12/2017")
            .enterFlightReturning("12/20/2017")
            .enterFlightAdults("4"). enterSearchTab();
    }






}
