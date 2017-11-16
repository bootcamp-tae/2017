package framework.mobile;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MobilePage extends CommonAndroidOperations {

    public MobilePage(){
        //AppiumFieldDecorator doc: https://appium.github.io/java-client/io/appium/java_client/pagefactory/AppiumFieldDecorator.html
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()),this);
    }

}
