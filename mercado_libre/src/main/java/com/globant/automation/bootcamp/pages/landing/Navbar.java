package com.globant.automation.bootcamp.pages.landing;

import com.globant.automation.bootcamp.pages.products.SearchResults;
import com.globant.automation.bootcamp.webdriver.web.Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Facundo on 13/11/2017.
 */
public class Navbar extends Component {

    @FindBy(className = "nav-search-input")
    private WebElement searchInput;

    @FindBy(className = "nav-search-btn")
    private WebElement searchButton;

    protected Navbar(WebElement container) {
        super(container);
    }

    public Navbar setSearchText(String text) {
        sendKeys(searchInput, text);
        return this;
    }

    public SearchResults seeResults() {
        click(searchButton);
        return new SearchResults();
    }

}
