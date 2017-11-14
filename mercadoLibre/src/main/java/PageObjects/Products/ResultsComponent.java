package PageObjects.Products;

import PageObjects.MercadoLibreComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class ResultsComponent extends MercadoLibreComponent {
    @FindBy (className = "results-item")
    private List<WebElement> resultsItems;



    public ResultsComponent(WebElement webElement) {
        super(webElement);
    }

    private List<ProductCard> toProductComponent(){
        waitFor(visibilityOfAllElements(resultsItems));
        return resultsItems.stream().map(ProductCard::new).collect(toList());
    }

    public ProductCard selectProduct(int i) {
        return toProductComponent().get(i);
    }

    public void getProduct(int i) {
    }
}