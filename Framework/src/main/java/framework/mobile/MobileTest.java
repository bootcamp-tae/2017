package framework.mobile;

import org.junit.After;
import org.junit.Before;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

public abstract class MobileTest <T extends MobilePage> {

    @Parameter
    public Devices device;
    /* TODO ask teacher about this, I forget somethings.*/
    @Parameters(name = "Device: {0}")
    public static List<Devices> dispositives(){ // TODO : What's this warning¿?
        //turns into a list our androids Devices.
        return Arrays.asList(Devices.ANDROID);
    }

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desCaps = new DesiredCapabilities();
            //une las capabilities de androids con las basicas.
        desCaps.merge(device.getCapabilities()); // TODO : ASK WHY NOT WORK WITH THE ANDROID ONE. SEE CLASS.
        setCapabilities(desCaps);
        Context.INSTANCE.init(desCaps);
    }

    @After
    public void tearDown() {
        Context.INSTANCE.finish();
    }

    public abstract void setCapabilities(DesiredCapabilities capabilities);




}
