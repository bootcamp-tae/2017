package components;

import org.openqa.selenium.support.PageFactory;

public class Page extends PageBasicOps {
    protected Page() {
        PageFactory.initElements(getDriver(), this);
    }
}
