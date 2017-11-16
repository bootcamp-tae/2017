package bootcamp.PageComponents;

import components.WebComponent;
import bootcamp.landing.MercadoLibreResults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBar extends WebComponent{

    @FindBy(className = "nav-search-input")
    private WebElement searchInput;

    @FindBy(className = "nav-search-btn")
    private WebElement clickSearch;

    public SearchBar(WebElement container) {
        super(container);
    }

    public MercadoLibreResults search(String search){
        type(searchInput, search);
        click(clickSearch);
        return new MercadoLibreResults();
    }

}
