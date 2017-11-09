package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    private static final int TIMEOUT_IN_SECONDS = 60;

    private final WebDriver driver;
    private final WebDriverWait wait;

    protected Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT_IN_SECONDS);
    }

    protected WebDriver getDriver() {
        return driver;
    }

    protected WebDriverWait getWait() {
        return wait;
    }
}
