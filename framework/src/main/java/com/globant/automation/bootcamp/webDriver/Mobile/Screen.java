package com.globant.automation.bootcamp.webDriver.Mobile;

import com.globant.automation.bootcamp.webDriver.CommonOperations;
import org.openqa.selenium.support.PageFactory;

public abstract class Screen extends CommonOperations{
    protected Screen() {
        PageFactory.initElements(getDriver(), this);
    }
}
