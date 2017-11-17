package deskClock.activities.screens;

import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class Tabs extends MobilePage {

    @AndroidFindBy(id = "Alarm")
    private WebElement alarmTab;

    @AndroidFindBy(id = "Clock")
    private WebElement clockTab;

    @AndroidFindBy(id = "Timer")
    private WebElement timerTab;

    @AndroidFindBy(id = "Stopwatch")
    private WebElement stopwatchTab;

    public AlarmScreen getAlarmScreen() {
        click(alarmTab);
        return new AlarmScreen();
    }

    public ClockScreen getClock() {
        click(clockTab);
        return new ClockScreen();
    }

    public TimerScreen getTimer() {
        click(timerTab);
        return new TimerScreen();
    }

    public StopwatchScreen getStopwatch() {
        click(stopwatchTab);
        return new StopwatchScreen();
    }

}
