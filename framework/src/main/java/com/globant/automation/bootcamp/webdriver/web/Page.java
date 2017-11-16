package com.globant.automation.bootcamp.webdriver.web;

import com.globant.automation.bootcamp.webdriver.CommonOperations;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class Page extends CommonOperations {

    protected Page() {
        PageFactory.initElements(getDriver(), this);
    }

}