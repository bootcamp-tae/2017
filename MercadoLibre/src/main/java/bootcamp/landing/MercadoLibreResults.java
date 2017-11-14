package bootcamp.landing;

import bootcamp.MercadoLibrePage;
import bootcamp.PageComponents.Filters;
import bootcamp.PageComponents.Items;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class MercadoLibreResults extends MercadoLibrePage{

    @FindBy(css = "#searchResults > li")
    private List<WebElement> itemsResults;

    @FindBy(css = ".filters__groups")
    private WebElement filtersContainer;

    public List<Items> getItems() {
        waitFor(visibilityOfAllElements(itemsResults));
        return itemsResults.stream().map(Items::new).collect(toList());
    }

    public Filters filter() {
        return new Filters(filtersContainer);
    }

}
