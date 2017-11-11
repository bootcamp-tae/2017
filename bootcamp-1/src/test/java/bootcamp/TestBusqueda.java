package bootcamp;

import bootcamp.pages.CheapTicketsHome;
import bootcamp.pages.CheapTicketsOpenLink;
import bootcamp.pages.CheapTicketsResult;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Arrays;

import static junit.framework.TestCase.fail;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
//public class TestBusqueda extends WebTest<>{
    public class TestBusqueda{

    private WebDriver driver;

    public TestBusqueda(WebDriver driver) {
        this.driver=driver;
    }

    @Parameterized.Parameters(name = "{index}:Browser[{0}]")
    public static Iterable<Object[]> data() {
        RemoteWebDriver remoteWebDriver;
        ChromeDriverManager.getInstance().setup();
        return Arrays.asList(new Object[][]{
                {new ChromeDriver()}}
        );
    }

    @Before
    public void setUp(){
        try {
            driver.manage().window().maximize();
            driver.navigate().to("https://www.cheaptickets.com/");
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testSearch(){
        CheapTicketsHome home= new CheapTicketsHome(this.driver);
        CheapTicketsResult result= home.clickTabHotel()
                .enterSearch("Havana , Cuba")
                .inputFirstDate("12/4/2017")
                .inputLastDate("12/5/2017")
                .inputHotelRooms("1")
                .inputHotelAdults("1")
                .inputHotelChildren("0")
                .clickSearchButton();
            assertThat("Results exists",result.resultsExists());
    }

    @Test
    public void testClickOnOneSearchResult(){
        CheapTicketsHome home= new CheapTicketsHome(this.driver);
        CheapTicketsResult result=
                home.clickTabHotel()
                .enterSearch("Havana , Cuba")
                .inputFirstDate("12/4/2017")
                .inputLastDate("12/5/2017")
                .inputHotelRooms("1")
                .inputHotelAdults("1")
                .inputHotelChildren("0")
                .clickSearchButton()
                .loadResult();
        CheapTicketsOpenLink linkSelected=result
                .clickOneResult(1)
                .loadResult();
    }

    @Test
    public void testSearchResultFromFiveStarLessSeventyFive(){
        CheapTicketsHome home= new CheapTicketsHome(this.driver);
        CheapTicketsResult result= home
                .clickTabHotel()
                .enterSearch("Havana , Cuba")
                .inputFirstDate("12/4/2017")
                .inputLastDate("12/5/2017")
                .inputHotelRooms("1")
                .inputHotelAdults("1")
                .inputHotelChildren("0")
                .clickSearchButton()
                .loadResult();
        CheapTicketsOpenLink linkSelected=result
                .clickCheckFiveStar()
                .clickCheckLessThanSeventyFive()
                .clickOneResult(1)
                .loadResult();
    }

    @Test
    public void testSearchResultFromPropertyName(){
        CheapTicketsHome home= new CheapTicketsHome(this.driver);
        CheapTicketsResult result= home
                .clickTabHotel()
                .enterSearch("Havana , Cuba")
                .inputFirstDate("12/4/2017")
                .inputLastDate("12/5/2017")
                .inputHotelRooms("1")
                .inputHotelAdults("1")
                .inputHotelChildren("0")
                .clickSearchButton()
                .loadResult();
        CheapTicketsOpenLink linkSelected=result
                .inputNameOfProperty("ibero")
                .clickSearchNameProperty()
                .clickOneResult(1)
                .loadResult();
    }

}
