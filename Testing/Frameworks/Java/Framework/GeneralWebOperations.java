package Framework;

import CommonFramework.GeneralOperations;
import org.openqa.selenium.WebDriver;

import javax.naming.Context;

public abstract class GeneralWebOperations extends GeneralOperations {

    protected WebDriver getDriver()
    {
        return Framework.Context.INSTANCE.getDriver();
    }
}
