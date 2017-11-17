package pages.clock_pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBySet;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class ChronometerPage extends ClockInitialPage{

    @AndroidFindBy(id = ANDROID_CLOCK_PACKAGE + "fab")
    private MobileElement startButton;

    @AndroidFindBy(id = ANDROID_CLOCK_PACKAGE + "fab")
    private MobileElement stopButton;

    @AndroidFindBy(id = ANDROID_CLOCK_PACKAGE + "left_button")
    private MobileElement resetButton;

    @AndroidFindBySet ({
            @AndroidFindBy(id = ANDROID_CLOCK_PACKAGE + "stopwatch_circle"),
            @AndroidFindBy(className = "android.view.View")
    })
    private MobileElement lblValue;

    @AndroidFindBy(id = ANDROID_CLOCK_PACKAGE + "stopwatch_time_text")
    private MobileElement clock;

    public ChronometerPage start(){
        click(startButton);
        return this;
    }

    public ChronometerPage timeOut(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ChronometerPage stop(){
        click(stopButton);
        return this;
    }

    public ChronometerPage reset(){
        click(resetButton);
        return this;
    }

    public String getTime() {
        //"name" for "content-desc" attribute
        return lblValue.getAttribute("name");
    }

}
