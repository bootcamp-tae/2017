package mobile;

import components.ContextDriver;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import junit.ParametrizedParallelism;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

@RunWith(ParametrizedParallelism.class)
public abstract class MobileTest <T extends MobilePage>{

    protected abstract T getInitialPage();

    @Parameter
    public Devices device;

    @Parameters(name = "Devices: {0}")
    public static List<Devices> browsers() {
        return Arrays.asList(Devices.ANDROID);
    }

    @Before
    public void setUp()throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.merge(device.getCapabilities());
        setCapabilities(desiredCapabilities);
        ContextDriver.INSTANCE.init(desiredCapabilities);
    }

    protected abstract void setCapabilities(DesiredCapabilities desiredCapabilities);

    @After
    public void tearDown(){
        ContextDriver.INSTANCE.terminate();
    }
}

