package com.globant.automation.bootcamp.webdriver.web;

import com.globant.automation.bootcamp.tests.junit.ParametrizedParallelism;
import com.globant.automation.bootcamp.logging.Logging;
import com.globant.automation.bootcamp.webdriver.Context;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.ParameterizedType;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

import static java.lang.String.format;

@RunWith(ParametrizedParallelism.class)
public abstract class WebTest<T extends Page> implements Logging{

    @Parameter
    public Browser browser;

    @Parameters(name = "Browser: {0}")
    public static List<Browser> browsers() {
        return Arrays.asList(Browser.values());
    }

    protected abstract T getInitialPage();

    protected abstract String getInitialUrl();

    @SuppressWarnings("unchecked")
    private Class<T> getParameterizedType() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Before
    public void setUp() throws MalformedURLException{
        WebDriver driver = Context.INSTANCE.init(browser);
        Class<T> pageObjectType = getParameterizedType();
        try {
            getLogger().debug(format("Creating instance of [%s] with browser [%s]...", pageObjectType.getSimpleName(), driver));
            driver.manage().window().maximize();
            driver.get(getInitialUrl());
        }catch (Exception e){
            getLogger().error(format("Could not instantiate Page Object [$s]", pageObjectType.getName()), e);
        }

    }

    @After
    public void tearDown() {
        getLogger().debug("Tearing down browser...");
        Context.INSTANCE.terminate();
    }

}
