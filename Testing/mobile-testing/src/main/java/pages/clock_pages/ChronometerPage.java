package pages.clock_pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ChronometerPage extends ClockInitialPage{

    @AndroidFindBy(id = ANDROID_CLOCK_PACKAGE + "fab")
    WebElement startButton;

    @AndroidFindBy(id = ANDROID_CLOCK_PACKAGE + "fab")
    WebElement stopButton;

    @AndroidFindBy(id = ANDROID_CLOCK_PACKAGE + "left_button")
    WebElement resetButton;

    @AndroidFindBy(id = ANDROID_CLOCK_PACKAGE + "stopwatch_time_text")
    WebElement clock;



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

    public String getTime(){
        return getText(clock);
    }

}
