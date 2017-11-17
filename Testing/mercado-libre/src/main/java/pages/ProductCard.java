package pages;

import com.globant.automation.bootcamp.webdriver.webdriver.Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCard extends Component {
    /**
     * @param container
     */

    @FindBy(className = "item__info-title")
    private WebElement link;

    protected ProductCard(WebElement container) {
        super(container);
    }

    public ProductPage select(){
        click(link);
        return new ProductPage();
    }
}
