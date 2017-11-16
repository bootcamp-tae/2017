package Framework;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public abstract class WebTest<X extends Page> {

    protected abstract X getInitialPage();
    protected abstract String getInitialUrl();

    @Before
    public void setUp(){
        WebDriver driver = Context.INSTANCE.init(Browser.CHROME);
        driver.manage().window().maximize();
        driver.get("https://www.cheaptickets.com/");
    }
    @After

    public void setDown(){
        Context.INSTANCE.finish();
    }
}
