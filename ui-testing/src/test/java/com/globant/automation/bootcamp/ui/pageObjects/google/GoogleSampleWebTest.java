package com.globant.automation.bootcamp.ui.pageObjects.google;

import com.globant.automation.bootcamp.ui.google.pages.AnotherPage;
import com.globant.automation.bootcamp.ui.google.pages.GoogleHome;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

public class GoogleSampleWebTest {

  private ChromeDriver driver;

  @BeforeClass
  public static void doOnce() {
    FirefoxDriverManager.getInstance().setup();
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
    AnotherPage result = new GoogleHome()
        .search("Buscame algo")
        .selectResult(5);

    assertThat("Page contains text", result.getTitle(), containsString("BUSCAME"));
  }

}
