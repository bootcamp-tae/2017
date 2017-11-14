package bootcamp.Elements;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public enum Browser implements Initializable {
    CHROME {
        @Override
        public WebDriver initialize() {
            ChromeDriverManager.getInstance().setup();
            return new ChromeDriver();
        }
    }, FIREFOX {
        @Override
        public WebDriver initialize() {
            FirefoxDriverManager.getInstance().setup();
            return new FirefoxDriver();
        }
    }
}
