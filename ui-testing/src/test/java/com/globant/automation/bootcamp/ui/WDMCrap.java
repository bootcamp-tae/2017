package com.globant.automation.bootcamp.ui;

import com.globant.automation.bootcamp.tests.junit.ParametrizedParallelism;
import com.globant.automation.bootcamp.webdriver.Browser;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Arrays;
import java.util.List;

@RunWith(ParametrizedParallelism.class)
public class WDMCrap {

    @Parameter
    public Browser browser;

    private WebDriver driver;

    @Parameters(name = "Browser {0}")
    public static List<Browser> browsers() {
        return Arrays.asList(Browser.CHROME, Browser.IE);
    }

    @Test
    public void kaput() {
        browser.initialize();
        switch (browser) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case IE:
                driver = new InternetExplorerDriver();
                break;
            case EDGE:
                driver = new EdgeDriver();
                break;
        }
        driver.get("http://www.google.com");
    }

    @After
    public void shutDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
