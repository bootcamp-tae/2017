package com.globant.automation.bootcamp.ui.simplest;

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

public class Simple2WebTest {

    private static final By GOOGLE_SEARCH_TEXT_BOX = By.id("lst-ib");
    private static final By GOOGLE_RESULT_LINKS = By.xpath("//h3[@class='r']");
    private ChromeDriver driver;

    @BeforeClass
    public static void doOnce() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
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
    public void simpleTestVersion2() {
        WebElement searchBox = driver.findElement(GOOGLE_SEARCH_TEXT_BOX);
        searchBox.sendKeys("Busca" + Keys.ENTER);
        List<WebElement> results = driver.findElements(GOOGLE_RESULT_LINKS);
        results.get(5).click();
        assertThat("Page contains text", driver.getTitle(), containsString("BUSCAME"));
    }

}
