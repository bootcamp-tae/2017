package com.globant.automation.bootcamp.ui.pages.mercadolibre;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends MLPage {

    @FindBy(name = "as_word")
    private WebElement searchBox;

    @FindBy(css = "[class=\"nav-search-btn\"]")
    private WebElement searchBtn;


    public SearchResults search(String criteria) {
        type(searchBox,criteria);
        click(searchBtn);

        return new SearchResults();
    }

}
