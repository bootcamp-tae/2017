package pages;

import com.globant.automation.bootcamp.webdriver.webdriver.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercadoLibreHome extends Page{

    @FindBy(css = "body > header > div > form > input")
    private WebElement searchBar;

    @FindBy(css = "body > header > div > form > button.nav-search-btn > i")
    private WebElement searchButton;

    public MercadoLibreResults searchProduct(String search){
        type(searchBar, search);
        click(searchButton);

        return new MercadoLibreResults();
    }
}
