package pages.clock_pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ChronometerPage extends ClockInitialPage{

    @AndroidFindBy()
    WebElement startButton;

    @AndroidFindBy()
    WebElement stopButton;

    @AndroidFindBy()
    WebElement clock;

    public ChronometerPage start(){
        click(startButton);
        return this;
    }

    public ChronometerPage timeOut(long timeOut){
        try {
            Thread.sleep(timeOut);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public ChronometerPage stop(){
        click(stopButton);
        return this;
    }

    public String getTime(){
        return getText(clock);
    }

}
