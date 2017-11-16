package com.globant.automation.bootcamp.webDriver.Web;


import com.globant.automation.bootcamp.webDriver.CommonOperations;
import org.openqa.selenium.support.PageFactory;

public abstract class Page extends CommonOperations {

    protected Page() {
        PageFactory.initElements(getDriver(), this);
    }

}