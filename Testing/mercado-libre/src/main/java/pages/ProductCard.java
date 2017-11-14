package pages;

import com.globant.automation.bootcamp.webdriver.webdriver.Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCard extends Component {
    /**
     * @param container
     */

    @FindBy(linkText = "#MLA684897679 > div.item__info-container > div > h2 > a > span")
    private WebElement link;

    protected ProductCard(WebElement container) {
        super(container);
    }

    public ProductPage select(){
        click(link);
        return new ProductPage();
    }
}
