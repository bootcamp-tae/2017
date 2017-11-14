package bootcamp.landing;

import bootcamp.Elements.WebComponent;
import bootcamp.MercadoLibrePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class SearchBar extends MercadoLibrePage{

    @FindBy(className = "nav-search-input")
    private WebElement searchInput;

    @FindBy(className = "nav-search-btn")
    private WebElement clickSearch;

    public MercadoLibreResults search(String search){
        type(searchInput, search);
        click(clickSearch);
        return new MercadoLibreResults();
    }

}
