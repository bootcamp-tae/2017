package Framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;

public abstract class Component {
    protected Component(WebElement container) {
        PageFactory.initElements(new DefaultFieldDecorator(new DefaultElementLocatorFactory(container)), this);
    }
}
