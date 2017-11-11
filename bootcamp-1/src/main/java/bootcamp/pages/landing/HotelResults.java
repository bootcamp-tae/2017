package bootcamp.pages.landing;

import bootcamp.pages.CheapTicketsPage;
import bootcamp.pages.components.HotelCard;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static java.util.stream.Collectors.toList;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class HotelResults extends CheapTicketsPage{


    @FindBy(id="resultsContainer")
    private WebElement resultsContainer;

    @FindBy(className = "flex-content info-and-price HIGHER_LEVEL_REGION avgPerNight")
    private List<WebElement> resultLinks;

    @FindBy(id="star5")
    private WebElement checkFiveStars;

    @FindBy(id="price1")
    private WebElement checkLessThanSeventyFive;

    @FindBy(id="inpHotelNameMirror")
    private WebElement inputNameProperty;

    @FindBy(xpath = "//*[@id=\"hotelNameContainer\"]/div/fieldset/div/div/div[2]/span/button")
    private WebElement btnSearchName;

    @FindBy(css = "[data-automation='organic']")
    private List<WebElement> hotels;

    public List<HotelCard> getHotels() {
        waitFor(visibilityOfAllElements(hotels));
        return hotels.stream().map(HotelCard::new).collect(toList());
    }

}
