package mercadolibre.pages;

import com.globant.automation.bootcamp.webdriver.web.Page;
import mercadolibre.models.ProductCard;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class Results extends Page {

    @FindBy(css = "#id_condition > dd:nth-child(2) > a")
    private WebElement filterNew;

    @FindBy(css = "li.results-item")
    private List<WebElement> results;

    public Results applyFilter(String filter){
        click(filterNew);
        return this;
    }

    public List<ProductCard> getProducts(){
        waitFor(visibilityOfAllElements(results));
        return results.stream().map(ProductCard::new).collect(toList());
    }
}
