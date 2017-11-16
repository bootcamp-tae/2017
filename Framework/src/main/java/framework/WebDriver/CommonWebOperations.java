package framework.WebDriver;

import framework.CommonOps;
import org.openqa.selenium.WebDriver;

public abstract class CommonWebOperations extends CommonOps{

    protected WebDriver getDriver(){
        return Context.INSTANCE.getDriver();
    }
}
