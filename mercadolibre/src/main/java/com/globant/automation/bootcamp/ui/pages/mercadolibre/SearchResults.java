package com.globant.automation.bootcamp.ui.pages.mercadolibre;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class SearchResults extends MLPage {

    @FindBy(className = "results-item")
    private List<WebElement> searchResults;

    @FindBy(css = "#id_condition > dd:nth-child(2)")
    private WebElement filter;

    public SearchResults filter(){
        click(filter);
        return new SearchResults();
    }

    public List<ProductCard> getResults(){
        waitFor(ExpectedConditions.visibilityOfAllElements(searchResults));
        return searchResults.stream().map(ProductCard::new).collect(toList());
    }

}
