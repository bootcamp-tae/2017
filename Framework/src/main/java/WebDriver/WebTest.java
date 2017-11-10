package WebDriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class WebTest <T extends Page>{

    protected abstract T getInitialPage();
    protected abstract String getInitialURL();

    @Before
    public void setUp(){
        WebDriver driver = Context.INSTANCE.initDriver(Browser.FIREFOX);
        driver.manage().window().maximize();
        driver.get(getInitialURL());
    }

    @After
    public void tearDown(){
        Context.INSTANCE.finish();
    }

}
