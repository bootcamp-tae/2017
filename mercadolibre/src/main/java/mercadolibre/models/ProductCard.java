package mercadolibre.models;

import com.globant.automation.bootcamp.webdriver.Component;
import mercadolibre.pages.Product;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCard extends Component{

    @FindBy(className = "main-title")
    private WebElement title;

    public ProductCard(WebElement container) {
        super(container);
    }

    public Product choose(){
        click(title);
        return new Product();
    }
}
