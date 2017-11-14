package bootcamp.Elements;

import org.openqa.selenium.WebDriver;

enum ContextDriver {

    INSTANCE;

    private static final ThreadLocal<WebDriver> driver_thread=new ThreadLocal<>();

    WebDriver getDriver(){
        return driver_thread.get();
    }

    WebDriver init(Browser browser){
        WebDriver driver=browser.initialize();
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
