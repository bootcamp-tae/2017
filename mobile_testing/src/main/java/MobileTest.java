import com.globant.automation.bootcamp.tests.junit.ParametrizedParallelism;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.ParameterizedType;
import java.net.MalformedURLException;

import static java.lang.String.format;

/**
 * Created by Facundo on 15/11/2017.
 */

@RunWith(ParametrizedParallelism.class)
public abstract class MobileTest extends Screen {

    @Parameter
    public OperSyst operatingSystem;

    /*private Class<T> getParameterizedType() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Before
    public void setUp() throws MalformedURLException {
        WebDriver driver = Context.INSTANCE.initDriver(browser);
        Class<T> pageObjectType = getParameterizedType();
        try {
            getLogger().debug(format("Creating instance of [%s] with browser [%s]...", pageObjectType.getSimpleName(), driver));
            driver.manage().window().maximize();
            driver.get(getInitialUrl());
        }catch (Exception e){
            getLogger().error(format("Could not instantiate Page Object [$s]", pageObjectType.getName()), e);
        }
    }


    /* Its this neccesary? Where it goes
    WebDriver initDriver(OperSyst operSyst) throws MalformedURLException {
        terminate(); // Just in case we have an existing driver running in the same thread

        operSyst.initialize();

        SeleniumServerBoot.INSTANCE.start();

        URL url = new URL(System.getProperty("APPIUM_URL", "http://0.0.0.0:4723/wd/hub"));

        WebDriver driver = new RemoteWebDriver(url, operSyst.getCapabilities());

        DRIVERS_PER_THREAD.set(driver);

        return driver;
    }*/

}
