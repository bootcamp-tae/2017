package com.globant.automation.bootcamp.ui.CheapTicketsTest.pageObjects;

import com.globant.automation.bootcamp.ui.pages.CheapTickets.CheapTicketsHome;
import com.globant.automation.bootcamp.ui.pages.CheapTickets.Search;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMCheapTicketsTest {
    private ChromeDriver driver;

    @BeforeClass
    public static void doOnce() {
        ChromeDriverManager.getInstance().setup();
    }

    @Before
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.cheaptickets.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void pomTestVersion() {
        CheapTicketsHome home = new CheapTicketsHome(driver);
        home
                .searchHotels(new Search("Mar del plata", "12/8/2017", "12/18/2017", 1, 2, 0))
                .selectResult(5);

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
