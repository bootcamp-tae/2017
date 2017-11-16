package com.globant.automation.bootcamp.webDriver.Mobile;

import com.globant.automation.bootcamp.webDriver.CommonOperations;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public abstract class Screen extends CommonOperations{
    protected Screen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }
}
