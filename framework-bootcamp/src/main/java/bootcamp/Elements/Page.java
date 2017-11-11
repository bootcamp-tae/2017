package bootcamp.Elements;

import org.openqa.selenium.support.PageFactory;

public class Page extends PageBase {
    protected Page() {
        PageFactory.initElements(getDriver(), this);
    }
}
