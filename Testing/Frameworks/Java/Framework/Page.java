package Framework;

import org.openqa.selenium.support.PageFactory;

public abstract class Page extends GeneralWebOperations {

    protected Page(){
        PageFactory.initElements(getDriver(),this);
    }

}
