package com.globant.automation.bootcamp.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Page {

    private final WebDriver driver;

    protected Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }
}
