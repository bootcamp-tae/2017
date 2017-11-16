package MobileFramework;

import CommonFramework.GeneralOperations;
import org.openqa.selenium.WebDriver;

public abstract class GeneralMobileOperations extends GeneralOperations {
    protected WebDriver getDriver()
    {
        return MobileContext.INSTANCE.getDriver();
    }
}
