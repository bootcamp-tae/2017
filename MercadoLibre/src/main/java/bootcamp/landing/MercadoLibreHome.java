package bootcamp.landing;

import bootcamp.MercadoLibrePage;
import bootcamp.PageComponents.SearchBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercadoLibreHome extends MercadoLibrePage{

    @FindBy(className = "nav-search")
    private WebElement navbar;

    public SearchBar getBar() {
        return new SearchBar(navbar);
    }
}
