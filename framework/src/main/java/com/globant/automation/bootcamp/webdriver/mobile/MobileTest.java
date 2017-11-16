package com.globant.automation.bootcamp.webdriver.mobile;

import com.globant.automation.bootcamp.webdriver.Context;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public abstract class MobileTest<T extends MobilePage> {

    @Parameter
    public Devices device;

    @Parameters
    public static Collection<Devices> devices() {
        return Arrays.asList(Devices.ANDROID);
    }

    protected abstract T getInitialPage();

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(device.getCapabilities());
        setCapabilities(desiredCapabilities);
        Context.INSTANCE.init(desiredCapabilities);
    }

    @After
    public void tearDown() {
        Context.INSTANCE.terminate();
    }

    public abstract void setCapabilities(DesiredCapabilities capabilities);
}
