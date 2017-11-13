package com.globant.automation.bootcamp.webDriver;

import com.globant.automation.bootcamp.tests.junit.ParametrizedParallelism;
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
public abstract class WebTest<T extends Page> {

    @Parameter
    public Browser browser;

    @Parameters(name = "Browser: {0}")
    public static List<Browser> browsers() {
        return Arrays.asList(Browser.values());
    }

    protected abstract T getInitialPage();

    protected abstract String getInitialUrl();

    @Before
    public void setUp() throws MalformedURLException {
        WebDriver driver = Context.INSTANCE.init(browser);
        driver.manage().window().maximize();
        driver.get(getInitialUrl());
    }

    @After
    public void tearDown() {
        Context.INSTANCE.terminate();
    }

}