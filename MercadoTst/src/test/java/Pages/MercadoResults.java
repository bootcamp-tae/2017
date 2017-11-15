package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class MercadoResults extends MercadoHome {

    @FindBy(className = "qcat-truncate")
    private WebElement filter;

    @FindBy(className = "rowItem item item--stack new with-reviews  ")
    private List<WebElement> products;

    public MercadoResults applyFilter(){
        click(filter);
        return this;
    }

    public List<ProductCard> getResults(){
        waitFor(visibilityOfAllElements(products));
        return products.stream().map(ProductCard::new).collect(toList());
    }
}