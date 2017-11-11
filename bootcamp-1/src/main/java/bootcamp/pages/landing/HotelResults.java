package bootcamp.pages.landing;

import bootcamp.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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


}
