package com.globant.automation.bootcamp.webDriver.Mobile;

import com.globant.automation.bootcamp.tests.junit.ParametrizedParallelism;
import com.globant.automation.bootcamp.webDriver.Context;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

@RunWith(ParametrizedParallelism.class)
public abstract class MobileTest <T extends Screen>{

    @Parameterized.Parameter
    public Devices devices;

    @Parameterized.Parameters(name = "OperatingSystem: {0}")
    public static List<Devices> devices() {
        return Arrays.asList(Devices.ANDROID);
    }

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge((devices.getCapabilities()));
        setCapabilities(desiredCapabilities);
        Context.INSTANCE.init(desiredCapabilities);
    }

    protected abstract T getInitialScreen();

    protected abstract void setCapabilities(DesiredCapabilities desiredCapabilities);

    @After
    public void tearDown() {
        Context.INSTANCE.terminate();
    }
}
