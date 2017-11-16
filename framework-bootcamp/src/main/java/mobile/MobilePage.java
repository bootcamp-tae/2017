package mobile;

import bootcamp.Elements.PageBasicOps;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MobilePage extends PageBasicOps {

    protected MobilePage() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }
}
