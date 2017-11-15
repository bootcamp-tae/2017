package com.globant.automation.bootcamp.webdriver.mobile;

import com.beust.jcommander.Parameter;
import com.globant.automation.bootcamp.webdriver.Context;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;


public abstract class MobileTest  <T extends MobilePage> {

    @Parameter
    public Devices device;

    protected abstract T getInitialPage();

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(device.getCapabilities());
        Context.INSTANCE.init(desiredCapabilities);

    }

    @After
    public void tearDown(){  Context.INSTANCE.terminate();}

    public abstract void setCapabilities(DesiredCapabilities capabilities);
}
