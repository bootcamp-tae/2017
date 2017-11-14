package com.globant.automation.bootcamp.ui.pages.mercadolibre;

import com.globant.automation.bootcamp.webdriver.Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductCard extends Component {

    @FindBy(tagName = "h2")
    private WebElement link;

    protected ProductCard(WebElement container) {
        super(container);
    }


    public ProductDetails select() {
        click(link);
        return new ProductDetails();
    }

}
