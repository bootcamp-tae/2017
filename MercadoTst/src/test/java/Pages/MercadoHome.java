package Pages;
import WebDriver.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercadoHome extends Page{

    @FindBy(css = "body > header > div > form > input")
    private WebElement searchBar;

    @FindBy(css = "body > header > div > form > button.nav-search-btn > i")
    private WebElement searchButton;

    public MercadoResults searchProduct(String search){
        type(searchBar, search);
        click(searchButton);

        return new MercadoResults();
    }
}