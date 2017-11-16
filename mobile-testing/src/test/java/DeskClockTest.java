import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;
import deskClock.activities.AlarmScreen;
import deskClock.activities.InitialScreen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.management.modelmbean.DescriptorSupport;
import java.net.MalformedURLException;
import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DeskClockTest extends MobilePage{

    @Test
    public void setAlarmTest() throws MalformedURLException {
        AlarmScreen alarmScreen = new InitialScreen()
                .getAlarms()
                .selectAlarm(1)
                .modifyHour(9);

        assertThat("The alarm time is set to", alarmScreen.getTime(), is("9:30"));
    }


}
