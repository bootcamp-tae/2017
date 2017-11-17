package deskClock.activities.screens;

import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;
import deskClock.activities.cards.AlarmCard;
import deskClock.activities.cards.ClockCard;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBySet;
import org.openqa.selenium.WebElement;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class AlarmScreen extends MobilePage {

    private static final String ANDROID_PREFIX = "com.android.deskclock:id/";

    @AndroidFindBySet({
            @AndroidFindBy(id = ANDROID_PREFIX + "alarms_recycler_view"),
            @AndroidFindBy(className = "android.widget.TextView")
    })
    private List<WebElement> alarms;

    @AndroidFindBy(id = ANDROID_PREFIX + "fab")
    private WebElement addAlarmButton;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement okButton;

    @AndroidFindBySet({
            @AndroidFindBy(id = ANDROID_PREFIX + "collapse_expand"),
            @AndroidFindBy(className = "android.widget.ImageButton")
    })
    private WebElement minimizeButton;

    public List<AlarmCard> getAlarms(){
        waitFor(visibilityOfAllElements(alarms));
        return alarms.stream().map(AlarmCard::new).collect(toList());
    }

    //public ClockScreen addAlarm() {
    public AlarmScreen addAlarm() {
        click(addAlarmButton);
        //return new ClockScreen();
        return this;
    }

    public AlarmScreen setAlarm(){
        click(okButton);
        return new AlarmScreen();
    }

    public AlarmScreen minimizeAlarm() {
        click(minimizeButton);
        return this;
    }
}
