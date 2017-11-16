package ClockTests;

import com.globant.automation.bootcamp.webdriver.mobile.MobileTest;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.clock_pages.ChronometerPage;
import pages.clock_pages.ClockInitialPage;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClockTest extends MobileTest<ClockInitialPage> {


    @Test
    public void chronometerTest(){
        ChronometerPage chronometer = getInitialPage()
                .goToChronometer()
                .start()
                .timeOut(5)
                .stop();

        assertThat("The chronometer works", Double.valueOf(chronometer.getTime()), is(greaterThan(0d)));
    }

    @Override
    protected ClockInitialPage getInitialPage() {
        return new ClockInitialPage();
    }

    @Override
    protected void setCapabilities(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage", "com.android.deskclock");
        capabilities.setCapability("appActivity", ".Desklock");
        capabilities.setCapability("deviceName", "myDevice");
        capabilities.setCapability("platformName", "android");
    }
}
