package com.globant.automation.bootcamp.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleResults extends Page {

    @FindBy(xpath = "//h3[@class='r']")
    private List<WebElement> results;

    GoogleResults(WebDriver driver) {
        super(driver);
    }

    public AnotherPage selectResult(int index) {
        results.get(index).click();
        return new AnotherPage(getDriver());
    }
}
