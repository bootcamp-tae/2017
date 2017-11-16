package pages.clock_pages;

import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ClockInitialPage extends MobilePage{
    
    @AndroidFindBy(accessibility = "Stopwatch")
    private WebElement chronometer;

    public ChronometerPage goToChronometer(){
        click(chronometer);
        return new ChronometerPage();
    }
}
