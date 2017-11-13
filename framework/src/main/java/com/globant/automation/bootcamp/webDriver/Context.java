package com.globant.automation.bootcamp.webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

enum Context {

    INSTANCE;

    private static final ThreadLocal<WebDriver> DRIVERS_PER_THREAD = new ThreadLocal<>();

    WebDriver getDriver() {
        return DRIVERS_PER_THREAD.get();
    }

    WebDriver init(Browser browser) throws MalformedURLException {
        terminate(); // Just in case we have an existing driver running in the same thread

        browser.initialize();

        SeleniumServerBoot.INSTANCE.start();

        URL url = new URL(System.getProperty("SELENIUM_URL", "http://127.0.0.1:4444/wd/hub"));

        WebDriver driver = new RemoteWebDriver(url, browser.getCapabilities());

        DRIVERS_PER_THREAD.set(driver);

        return driver;
    }

    void terminate() {
        WebDriver driver = getDriver();
        if (driver != null) {
            getDriver().quit();
        }
        DRIVERS_PER_THREAD.remove();

    }
}