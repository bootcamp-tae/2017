package ClockTests;

import com.globant.automation.bootcamp.webdriver.mobile.MobileTest;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.clock_pages.ChronometerPage;
import pages.clock_pages.ClockInitialPage;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClockTest extends MobileTest<ClockInitialPage> {


    @Test
    public void chronometerTest(){
        ChronometerPage chronometer = getInitialPage()
                .goToChronometer()
                .start()
                .timeOut(500)
                .stop();

        assertThat("The chronometer works", chronometer.getTime(), is(greaterThan("0 minutes 0 seconds")));

        chronometer.reset();

        assertThat("The chronometer has been reset", chronometer.getTime(), is("0 minutes 0 seconds"));
    }

    @Override
    protected ClockInitialPage getInitialPage() {
        return new ClockInitialPage();
    }

    @Override
    protected void setCapabilities(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage", "com.android.deskclock");
        capabilities.setCapability("appActivity", ".DeskClock");
        capabilities.setCapability("deviceName", "kenzo");
        capabilities.setCapability("platformName", "android");
    }
}
