package bootcamp.Elements;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

enum ContextDriver {

    INSTANCE;

    private static final ThreadLocal<WebDriver> driver_thread=new ThreadLocal<>();

    WebDriver getDriver(){
        return driver_thread.get();
    }

    WebDriver init(Browser browser){
        WebDriver driver=null;
        switch (browser){
            case CHROME:
                ChromeDriverManager.getInstance().setup();
                driver=new ChromeDriver();
                break;
            case FIREFOX:
                FirefoxDriverManager.getInstance().setup();
                driver=new FirefoxDriver();
                break;
        }
        driver_thread.set(driver);
        return driver;
    }

    void terminate(){
        WebDriver driver = getDriver();
        if(driver!=null){
            getDriver().quit();
        }
        driver_thread.remove();
    }

}
