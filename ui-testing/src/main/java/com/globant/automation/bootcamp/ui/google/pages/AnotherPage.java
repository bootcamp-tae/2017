package com.globant.automation.bootcamp.ui.google.pages;

import org.openqa.selenium.WebDriver;

public class AnotherPage {

    private final WebDriver driver;

    public AnotherPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
