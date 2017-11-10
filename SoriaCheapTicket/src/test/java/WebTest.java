import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public abstract  class WebTest<T extends InitialPage> {

    protected abstract T getInitialPage();

    @Before
    public  void setUp(){
        WebDriver driver = Context.INSTANCE.init(Browser.FIREFOX);
    }
}
