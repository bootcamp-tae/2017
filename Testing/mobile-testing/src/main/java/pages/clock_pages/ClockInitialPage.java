package pages.clock_pages;

import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ClockInitialPage extends MobilePage{

    protected static final String  ANDROID_CLOCK_PACKAGE= "com.android.deskclock:id/";

    //It works, but i should see a better identificator or another way to identificate this element
    @AndroidFindBy(accessibility = "Stopwatch")
    private MobileElement chronometer;



    public ChronometerPage goToChronometer(){
        click(chronometer);
        return new ChronometerPage();
    }
}