package com.globant.automation.bootcamp.ui.pages;

import com.globant.automation.bootcamp.ui.pages.CheapTickets.CheapTicketsResults;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public abstract class Page {

    private WebDriver driver;

    protected Page(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected WebDriver getDriver(){
        return this.driver;
    }

    protected Page selectFromDropDownText(WebElement element, String value){
        new Select(element).selectByValue(value);
        return this;
    }

    protected Page selectFromDropDown(WebElement element, int index){
        new Select(element).selectByIndex(index);
        return this;
    }

    protected void enterDate(WebElement element, String date){
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].value = arguments[1]", element, date);
    }
}
