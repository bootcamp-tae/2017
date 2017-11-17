package com.globant.automation.bootcamp.webdriver.mobile;

import com.globant.automation.bootcamp.webdriver.CommonOperations;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

//Esto deberia heredar de Component que hereda de CommonOperations
//Esto se hace para reducir el scope de la busqueda
public abstract class MobilePage extends CommonOperations {

    protected MobilePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }

}
