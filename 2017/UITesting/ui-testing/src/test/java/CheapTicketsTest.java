
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CheapTicketsTest extends WebTest<Home> { // La clase debe terminar con Test para que maven encuentre la Suite

    private  ChromeDriver driver;

    @BeforeClass
    public static void doOnce(){
        ChromeDriverManager.getInstance().setup();
    }

    @Before
    public void setUp(){
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.cheaptickets.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void pomTestVersion(){
        CheapTicketsHome home = new CheapTicketsHome(driver);
        Search s = new Search("Chicago, IL", "11/10/2017", "11/25/2017", "1", "4", "0");
        CheapTicketsResults results = home.searchHotels(s);
        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertThat("Page contains text", results.getDriver().getTitle(), containsString("Mobile"));
    }
}
