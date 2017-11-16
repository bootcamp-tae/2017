package components;

import junit.ParametrizedParallelism;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

@RunWith(ParametrizedParallelism.class)
public abstract class WebTest <T extends Page>{

    protected abstract T getInitialPage();
    protected abstract String getUrl();

    @Parameter
    public Browser browser;


    @Parameters(name = "Browser: {0}")
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
