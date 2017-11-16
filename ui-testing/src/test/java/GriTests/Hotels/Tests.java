package GriTests.Hotels;

import GriPageObjects.CheapTickets;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class Tests {

    private ChromeDriver driver;

    @BeforeClass
    public static void doOnce() {
        ChromeDriverManager.getInstance().setup();
    }

    @Before
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cheaptickets.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void algoVamosaHacer() throws InterruptedException {
        CheapTickets home = new CheapTickets(driver);
        home.clickHotels();
        home.chargeInputs("London, England, United Kingdom","11/20/2017","11/22/2017","2","1");
        home.selectHotel(driver);
    }

}
