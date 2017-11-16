package com.globant.automation.bootcamp.webdriver.mobile;

import com.globant.automation.bootcamp.webdriver.CommonOperations;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Facundo on 15/11/2017.
 */
public class Screen extends CommonOperations {

    protected Screen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

}
