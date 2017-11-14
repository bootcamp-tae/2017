package PageObjects.Landing;

import PageObjects.MercadoLibreComponent;
import PageObjects.Products.SearchResultsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavBound extends MercadoLibreComponent {

    @FindBy(className = "nav-search-input")
    private WebElement searchIput;

    @FindBy(className = "nav-icon-search")
    private WebElement searchIcon;

    public NavBound(WebElement webElement) {
        super(webElement);
    }

    public SearchResultsPage searchProduct(String criteria){
        type(searchIput, criteria);
        click(searchIcon);
        return new SearchResultsPage();
    }
}
