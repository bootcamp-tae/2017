package PageObjects.Products;

import PageObjects.MercadoLibreComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCard extends MercadoLibreComponent {

    @FindBy (className = "main-title")
    private WebElement title;

    protected ProductCard(WebElement webElement) {
        super(webElement);
    }

    public ProductPage goToDetails() {
        click(title);
        return new ProductPage();
    }

}
