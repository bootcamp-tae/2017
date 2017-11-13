package com.globant.automation.bootcamp.pages.products;

import com.globant.automation.bootcamp.webdriver.Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Facundo on 13/11/2017.
 */
public class ProductCard extends Component{

    private static final Pattern PATTERN = Pattern.compile("\\d+(([.,])\\d+?)?");

    @FindBy(xpath = "//*[@id=\"MLA671378367\"]/div[1]/div/div/a/img")
    private WebElement link;

    @FindBy(css = ".main-title")
    private WebElement productName;

    @FindBy(css = ".price-fraction")
    private WebElement productPrice;

    public ProductCard(WebElement container) {
        super(container);
    }

    public String getProductName() {
        return getText(productName);
    }

    public double getProductPrice() {
        String p = getText(productPrice);
        Matcher m = PATTERN.matcher(p);
        if (m.find()) {
            return Double.parseDouble(m.group(0));
        }
        return 0;
    }

    public ProductDetails getProductDetails() {
        click(link);
        return new ProductDetails();
    }
}
