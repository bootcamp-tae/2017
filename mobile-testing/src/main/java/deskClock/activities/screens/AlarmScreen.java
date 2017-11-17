package deskClock.activities.screens;

import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;
import deskClock.activities.cards.ClockCard;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AlarmScreen extends MobilePage {

    private static final String ANDROID_PREFIX = "com.android.deskclock:id/";

    @AndroidFindBy(id = ANDROID_PREFIX + "alarms_recycler_view")
    private List<WebElement> alarms;

    @AndroidFindBy(id = ANDROID_PREFIX + "fab")
    private WebElement addAlarmButton;

    public List<WebElement> getAlarms(){
        return this.alarms;
    }

    public ClockCard addAlarm() {
        click(addAlarmButton);
        return new ClockCard();
    }
}
