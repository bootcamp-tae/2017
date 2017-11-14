package PageObjects.Products;

import PageObjects.MercadoLibrePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class SearchResultsPage extends MercadoLibrePage {
    @FindBy(className = "filters__groups")
    private WebElement filtersElement;

    @FindBy (id = "searchResults")
    private WebElement resultsElement;

    private final FiltersComponent filters = new FiltersComponent(filtersElement);

    private final ResultsComponent results = new ResultsComponent(resultsElement);

    public FiltersComponent filter(){
        waitFor(visibilityOf(filtersElement));
        return filters;
    }

    public ResultsComponent atTheProductResults() {
        waitFor(visibilityOf(resultsElement));
        return results;
    }
}
