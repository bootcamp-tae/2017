package bootcamp.PageComponents;

import bootcamp.Elements.WebComponent;
import bootcamp.MercadoLibrePage;
import bootcamp.landing.MercadoLibreResults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

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
