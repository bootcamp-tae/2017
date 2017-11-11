package bootcamp.Elements;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class WebTest <T extends Page>{

    protected abstract T getInitialPage();
    protected abstract String getUrl();

    @Before
    public void setUp(){
        WebDriver webDriver = ContextDriver.INSTANCE.init(Browser.CHROME);
        webDriver.manage().window().maximize();
        webDriver.get(getUrl());
    }

    @After
    public void tearDown(){
        ContextDriver.INSTANCE.terminate();
    }
}
