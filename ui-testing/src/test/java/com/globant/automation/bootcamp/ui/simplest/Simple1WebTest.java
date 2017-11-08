package com.globant.automation.bootcamp.ui.simplest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class Simple1WebTest {

    @Test
    public void simpleTestVersion1() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement searchbox = driver.findElement(By.id("lst-ib"));
        searchbox.sendKeys("Buscame algo" + Keys.ENTER);
        List<WebElement> results = driver.findElements(By.xpath("//h3[@class='r']"));
        results.get(5).click();
        assertThat("Page contains text", driver.getTitle(), containsString("BUSCAME"));
        driver.quit();
    }

}
