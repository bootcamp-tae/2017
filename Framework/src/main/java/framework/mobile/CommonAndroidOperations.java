package framework.mobile;

import framework.CommonOps;
import org.openqa.selenium.WebDriver;

public abstract class CommonAndroidOperations extends CommonOps {

    protected WebDriver getDriver(){
        return Context.INSTANCE.getDriver();
    }
}
