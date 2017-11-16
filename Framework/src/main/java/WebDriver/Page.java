package WebDriver;

import framework.CommonWebOps;
import org.openqa.selenium.support.PageFactory;

public abstract class Page extends CommonWebOps {

    protected Page(){
        PageFactory.initElements(getDriver(),this);
    }

}
