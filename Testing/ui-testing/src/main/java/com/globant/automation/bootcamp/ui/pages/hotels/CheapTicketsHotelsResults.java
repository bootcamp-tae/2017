package com.globant.automation.bootcamp.ui.pages.hotels;

import com.globant.automation.bootcamp.ui.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class CheapTicketsHotelsResults extends CheapTicketsPage{

    @FindBy(css = "[data-automation='organic']")
    private List<WebElement> hotels;

    public HotelDetail selectResult(int index){
        waitFor(visibilityOfAllElements(hotels));
        click(hotels.get(index));
        return new HotelDetail();
    }
}
