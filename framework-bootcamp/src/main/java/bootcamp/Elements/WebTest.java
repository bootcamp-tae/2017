package bootcamp.Elements;

import junit.ParametrizedParallelism;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

@RunWith(ParametrizedParallelism.class)
public abstract class WebTest <T extends Page>{

    protected abstract T getInitialPage();
    protected abstract String getUrl();

    @Parameterized.Parameter
    public Browser browser;


    @Parameterized.Parameters(name = "Browser: {0}")
    public static List<Browser> browsers() {
        return Arrays.asList(Browser.values());
    }

    @Before
    public void setUp()throws MalformedURLException {
        WebDriver webDriver = ContextDriver.INSTANCE.init(browser);
        webDriver.manage().window().maximize();
        webDriver.get(getUrl());
    }

    @After
    public void tearDown(){
        ContextDriver.INSTANCE.terminate();
    }
}
