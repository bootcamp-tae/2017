import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;
import deskClock.activities.screens.AlarmScreen;
import deskClock.activities.screens.InitialScreen;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DeskClockTest extends MobilePage{

    @Test
    public void setAlarmTest() throws MalformedURLException {
        AlarmScreen alarms = new InitialScreen()
                .getTabsBar()
                .getAlarmScreen();

        int sizeBefore = alarms.getAlarms().size();

        alarms.addAlarm()
                .setAlarm()
                .minimizeAlarm()
                .getAlarms()

        assertThat("The alarm time is set to", alarmScreen.getTime(), is("9:30"));
    }


}
