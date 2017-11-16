package com.globant.automation.bootcamp.webdriver.mobile;

import com.globant.automation.bootcamp.tests.junit.ParametrizedParallelism;
import com.globant.automation.bootcamp.webdriver.Context;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

@RunWith(ParametrizedParallelism.class)
public abstract class MobileTest<T extends MobilePage> {

    @Parameter
    public Platform platform;

    @Parameters(name = "Device: {0}")
    public static List<Platform> platforms() {
        return Arrays.asList(Platform.ANDROID);
    }

    protected abstract T getInitialPage();

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(platform.getCapabilities());
        setCapabilities(desiredCapabilities);
        Context.INSTANCE.init(desiredCapabilities);
    }

    protected abstract void setCapabilities(DesiredCapabilities capabilities);

    @After
    public void tearDown() {
        Context.INSTANCE.terminate();
    }

}