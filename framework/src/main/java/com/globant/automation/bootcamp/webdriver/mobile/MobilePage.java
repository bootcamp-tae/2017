package com.globant.automation.bootcamp.webdriver.mobile;

import com.globant.automation.bootcamp.webdriver.CommonOperations;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public abstract class MobilePage extends CommonOperations {

    protected MobilePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

}
