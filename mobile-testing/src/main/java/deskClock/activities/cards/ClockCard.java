package deskClock.activities.cards;

import com.globant.automation.bootcamp.webdriver.mobile.MobileComponent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ClockCard extends MobileComponent {

    public ClockCard(WebElement container) {
        super(container);
    }
}
