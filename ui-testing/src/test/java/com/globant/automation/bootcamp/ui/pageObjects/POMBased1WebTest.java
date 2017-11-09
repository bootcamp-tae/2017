package com.globant.automation.bootcamp.ui.pageObjects;

import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.AnotherPage;
import com.globant.automation.bootcamp.ui.pages.GoogleHome;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class POMBased1WebTest {

    private ChromeDriver driver;

    @BeforeClass
    public static void doOnce() {
        ChromeDriverManager.getInstance().setup();
    }

    @Before
    public void setUp() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void pomTestVersion1() {
        AnotherPage result = new GoogleHome(driver)
                .search("Buscame algo")
                .selectResult(5);

        assertThat("Page contains text", result.getTitle(), containsString("BUSCAME"));
    }

}
