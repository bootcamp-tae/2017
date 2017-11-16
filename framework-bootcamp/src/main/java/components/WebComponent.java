package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;

public class WebComponent extends PageBasicOps {
    protected WebComponent(WebElement container) {
        PageFactory.initElements(new DefaultFieldDecorator(new DefaultElementLocatorFactory(container)), this);
    }
}
