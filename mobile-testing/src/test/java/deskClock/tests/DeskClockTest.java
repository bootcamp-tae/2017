package deskClock.tests;

import com.globant.automation.bootcamp.webdriver.mobile.MobileTest;
import deskClock.activities.screens.AlarmScreen;
import deskClock.activities.screens.InitialScreen;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DeskClockTest extends MobileTest<InitialScreen> {

    @Test
    public void setAlarmTest() throws MalformedURLException {
        AlarmScreen alarms = getInitialPage()
                .getTabsBar()
                .getAlarmScreen();

        int sizeBefore = alarms.getAlarms().size();

        alarms.addAlarm()
                .setAlarm()
                .minimizeAlarm()
                .getAlarms();

        assertThat("The new alarm has been set", alarms.getAlarms().size(), is(sizeBefore + 2));
    }

    @Override
    protected InitialScreen getInitialPage() {
        return new InitialScreen();
    }

    @Override
    protected void setCapabilities(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage", "com.android.deskclock");
        capabilities.setCapability("appActivity", ".DeskClock");
    }
}
