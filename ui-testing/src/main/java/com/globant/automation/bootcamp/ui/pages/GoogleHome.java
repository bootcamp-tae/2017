package com.globant.automation.bootcamp.ui.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class GoogleHome extends Page {

    @FindBy(id = "lst-ib")
    private WebElement searchBox;

    public GoogleHome(WebDriver driver) {
        super(driver);
    }

    public GoogleHome selectFromDropDownText(String value) {
        new Select(searchBox).selectByVisibleText(value);
        return this;
    }


    public GoogleHome selectFromDropDown(String value) {
        new Select(searchBox).selectByValue(value);
        return this;
    }

    public GoogleHome selectFromDropDown(int index) {
        new Select(searchBox).selectByIndex(index);
        return this;
    }

    public GoogleResults search(String criteria) {
        searchBox.sendKeys(criteria + Keys.ENTER);
        return new GoogleResults(getDriver());
    }

}
