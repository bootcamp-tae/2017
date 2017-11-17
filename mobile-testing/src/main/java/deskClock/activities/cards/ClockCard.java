package deskClock.activities.cards;

import com.globant.automation.bootcamp.webdriver.mobile.Component;
import deskClock.activities.screens.AlarmScreen;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClockCard extends Component {

    private static final String ANDROID_PREFIX = "android:id/";

    @AndroidFindBy(id = ANDROID_PREFIX + "button1")
    private WebElement okButton;

    protected ClockCard(WebElement container) {
        super(container);
    }

    public AlarmCard setAlarm(){
        click(okButton);
        return new AlarmCard();
    }
}
