package com.globant.automation.bootcamp.ui.cheaptickets.pages.hotels;

import com.globant.automation.bootcamp.webdriver.Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FilterBar extends Component {

    @FindBy(css = ".btn-sort")
    private List<WebElement> filters;

    protected FilterBar(WebElement container) {
        super(container);
    }

}
