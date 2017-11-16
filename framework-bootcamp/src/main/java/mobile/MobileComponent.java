package mobile;

import components.PageBasicOps;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MobileComponent extends PageBasicOps{
    public MobileComponent(WebElement container) {
        PageFactory.initElements(new AppiumFieldDecorator(container), this);
    }
}
