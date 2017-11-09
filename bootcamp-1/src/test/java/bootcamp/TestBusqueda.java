package bootcamp;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class TestBusqueda {


    private WebDriver driver;

    public TestBusqueda(WebDriver driver) {
        this.driver=driver;
    }

    @Parameterized.Parameters(name = "{index}:Browser[{0}]")
    public static Iterable<Object[]> data() {
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
        try{
        CheapTicketsHome home= new CheapTicketsHome(this.driver);
        CheapTicketsResult result=home.doSearch("Havana , Cuba","1/4/2017","1/5/2017","1","1","0");
        //TODO
        assertThat("Results exists",result.resultados());
        }
        catch (Exception e){
            fail();
            e.getStackTrace();
        }
    }
}
