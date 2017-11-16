package Framework;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;


enum Context{

    INSTANCE;

    private static final ThreadLocal<WebDriver> DRIVERS_PER_THREAD = new ThreadLocal<>();

    WebDriver getDriver(){
        return DRIVERS_PER_THREAD.get();
    }

    WebDriver init(Browser browser){
        WebDriver driver = null;
        switch(browser) {
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver() ;
                break;

            case FIREFOX:
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;

            case IEXPLORER:
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;

            case EDGE:
                EdgeDriverManager.getInstance().setup();
                driver = new EdgeDriver();
                break;

            case OPERA:
                OperaDriverManager.getInstance().setup();
                driver = new OperaDriver();
                break;
        }
        DRIVERS_PER_THREAD.set(driver);
        return driver;
    }

    void finish() {
        WebDriver driver = getDriver();
        if (driver != null) {
            getDriver().quit();
        }
        DRIVERS_PER_THREAD.remove();
    }
}