package framework.WebDriver;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.WebDriver;
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


    WebDriver initDriver(Browser browser){
        WebDriver driver = null;
        switch (browser){
            case IE:
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            case FIREFOX:
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
            case EDGE:
                EdgeDriverManager.getInstance().setup();
                driver = new EdgeDriver();
                break;
            case OPERA:
                OperaDriverManager.getInstance().setup();
                driver = new OperaDriver();
                break;
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                break;
        }

        return driver;
    }

    public void finish(){
        WebDriver driver = getDriver();
        if(driver != null){
            driver.quit();
        }
        DRIVERS_PER_THREAD.remove();
    }

}
