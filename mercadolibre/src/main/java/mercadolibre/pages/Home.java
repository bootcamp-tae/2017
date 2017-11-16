package mercadolibre.pages;

import com.globant.automation.bootcamp.webdriver.web.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends Page{

    @FindBy(css = "body > header > div > form > input")
    private WebElement searchBox;

    @FindBy(css = "body > header > div > form > button.nav-search-btn > i")
    private WebElement searchButton;

    public Results search(String search){
        type(searchBox, search);
        click(searchButton);
        return new Results();
    }
}
