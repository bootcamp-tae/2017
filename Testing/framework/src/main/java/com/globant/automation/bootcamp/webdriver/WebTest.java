package com.globant.automation.bootcamp.webdriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class WebTest<T extends Page> {

    protected abstract T getInitialPage();

    protected abstract String getInitialUrl();

    @Before
    public void setUp() {
        WebDriver driver = Context.INSTANCE.init(Browser.CHROME);
        /*Como corro otros test con otros driver de otros navegadores
        WebDriver driver = Context.INSTANCE.init(Browser.EDGE);
        WebDriver driver = Context.INSTANCE.init(Browser.FIREFOX);
        WebDriver driver = Context.INSTANCE.init(Browser.IE);*/

        driver.manage().window().maximize();
        driver.get(getInitialUrl());
    }

    @After
    public void tearDown() {
        Context.INSTANCE.terminate();
    }

}
