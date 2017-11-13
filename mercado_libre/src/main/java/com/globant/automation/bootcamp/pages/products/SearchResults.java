package com.globant.automation.bootcamp.pages.products;

import com.globant.automation.bootcamp.MercadoLibrePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

/**
 * Created by Facundo on 13/11/2017.
 */
public class SearchResults extends MercadoLibrePage {

    @FindBy(css = ".results-item.article.stack")
    private List<WebElement> results;

    public List<ProductCard> getProducts() {
        waitFor(visibilityOfAllElements(results));
        return results.parallelStream()
                      .map(ProductCard::new)
                      .collect(toList());
    }

}
