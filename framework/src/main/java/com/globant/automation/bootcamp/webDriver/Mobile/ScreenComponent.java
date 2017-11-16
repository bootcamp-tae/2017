package com.globant.automation.bootcamp.webDriver.Mobile;

import com.globant.automation.bootcamp.webDriver.CommonOperations;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;

public class ScreenComponent extends CommonOperations{
    protected ScreenComponent(MobileElement container) {
        PageFactory.initElements(new DefaultFieldDecorator(new DefaultElementLocatorFactory(container)), this);
    }
}
