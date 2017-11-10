package com.globant.automation.bootcamp.webdriver;

import com.globant.automation.bootcamp.logging.Logging;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.ParameterizedType;

import static java.lang.String.format;

public abstract class WebTest<T extends Page> implements Logging{

    protected abstract T getInitialPage();

    protected abstract String getInitialUrl();

    @SuppressWarnings("unchecked")
    private Class<T> getParameterizedType() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Before
    public void setUp() {
        WebDriver driver = Context.INSTANCE.init(Browser.CHROME);
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
