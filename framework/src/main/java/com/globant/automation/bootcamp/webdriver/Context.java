package com.globant.automation.bootcamp.webdriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

enum Context {

  INSTANCE;

  private static final ThreadLocal<WebDriver> DRIVERS_PER_THREAD = new ThreadLocal<>();

  WebDriver getDriver() {
    return DRIVERS_PER_THREAD.get();
  }

  WebDriver init(Browser browser) {
    WebDriver driver = null;
    switch (browser) {
      case CHROME:
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        break;
      case FIREFOX:
        FirefoxDriverManager.getInstance().setup();
        driver = new FirefoxDriver();
        break;
      case IE:
        InternetExplorerDriverManager.getInstance().setup();
        driver = new InternetExplorerDriver();
        break;
      case EDGE:
        EdgeDriverManager.getInstance().setup();
        driver = new EdgeDriver();
        break;
    }
    DRIVERS_PER_THREAD.set(driver);
    return driver;
  }

  void terminate() {
    WebDriver driver = getDriver();
    if (driver != null) {
      getDriver().quit();
    }
  }
}