package firstAutomation.JUnit;

import firstAutomation.PageObjects.CheapTicketsOneResult;
import firstAutomation.PageObjects.CheapTicketsHomePage;
import io.github.bonigarcia.wdm.Architecture;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.joda.time.LocalDate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

/**
 * Created by Facundo on 08/11/2017.
 */
@RunWith(Parameterized.class)
public class JUnitSuite {

    private WebDriver browser;

    public JUnitSuite(WebDriver browser) {
        this.browser = browser;
    }

    @Parameterized.Parameters(name = "{index}:Browser[{0}]")
    public static Iterable<Object[]> data() {
        //InternetExplorerDriverManager.getInstance().setup(Architecture.x32);
        ChromeDriverManager.getInstance().setup();
        return Arrays.asList(new Object[][]{
                //{new InternetExplorerDriver()},
                {new ChromeDriver()}}
        );
    }

    @Before
    public void setUp() {
        browser.manage().window().maximize();
    }

    @After
    public void tearDown() {
        browser.quit();
    }

    // Depending on the conditions, sometimes it works, sometimes not
    @Test
    public void searchHotel() {
        CheapTicketsHomePage home = new CheapTicketsHomePage(browser);
        // Close top advice, annoying
        home.closeAdvice()
                //Checkout the notifications, and close the popup
                .checkoutNotificacions()
                .closePopUpNotification();
        // It continues doing stuff
        CheapTicketsOneResult content =
                home.clickOnHotelTab()
                        .setDestination("United States")
                        .chooseCheckinDate("12/8/2018")
                        .chooseCheckoutDate("12/18/2018")
                        .doSearch()
                        .clickOnResultNumber(1);
        content.seeResult();
    }

}
