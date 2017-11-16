package MobileFramework;

import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MobileView extends GeneralMobileOperations {

    protected MobileView(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }
}
