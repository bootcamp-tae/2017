package com.globant.automation.bootcamp.ui.cheaptickets.pages.hotels;

import com.globant.automation.bootcamp.ui.cheaptickets.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class HotelResults extends CheapTicketsPage {

    @FindBy(css = "[data-automation='organic']")
    private List<WebElement> hotels;

    public List<HotelCard> getHotels() {
        waitFor(visibilityOfAllElements(hotels));
        return hotels.parallelStream()
                     .map(HotelCard::new) // This is an intermediate operation, there may be many more here such as "sorted" , "limit", "filter", etc
                     .collect(toList());  //Last one its terminal operation, this time, collect the results in a list of "HotelCards"
    }

}
