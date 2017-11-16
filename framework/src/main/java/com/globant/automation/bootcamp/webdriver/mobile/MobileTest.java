package com.globant.automation.bootcamp.webdriver.mobile;

import com.globant.automation.bootcamp.tests.junit.ParametrizedParallelism;
import com.globant.automation.bootcamp.webdriver.Context;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

import static java.lang.String.format;

/**
 * Created by Facundo on 15/11/2017.
 */

@RunWith(ParametrizedParallelism.class)
public abstract class MobileTest<T extends Screen>{

    @Parameter
    public OperSyst operatingSystem;

    @Parameterized.Parameters(name = "OperatingSystem: {0}")
    public static List<OperSyst> operatingSystems() {
        return Arrays.asList(OperSyst.ANDROID);
    }

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge((operatingSystem.getCapabilities()));
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
