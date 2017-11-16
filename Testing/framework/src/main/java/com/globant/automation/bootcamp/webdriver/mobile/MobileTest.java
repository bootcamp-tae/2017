package com.globant.automation.bootcamp.webdriver.mobile;

import com.globant.automation.bootcamp.webdriver.junit.ParametrizedParallelism;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.globant.automation.bootcamp.webdriver.Context;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

@RunWith(ParametrizedParallelism.class)
public abstract class MobileTest<T extends MobilePage> {

    @Parameterized.Parameter
    public Platform platform;

    @Parameterized.Parameters(name = "Device: {0}")
    public static List<Platform> browsers() {
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
