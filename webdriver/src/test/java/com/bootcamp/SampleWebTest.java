package com.bootcamp;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SampleWebTest {

    @Test
    public void goToGoogle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        WebElement searchbox = driver.findElement(By.id("lst-ib"));
        searchbox.sendKeys("Buscame algo" + Keys.ENTER);
        List<WebElement> results = driver.findElements(By.xpath("//h3[@class=\"r\"]"));
        results.get(5).click();
        Thread.sleep(5000);
        driver.quit();
    }

}
