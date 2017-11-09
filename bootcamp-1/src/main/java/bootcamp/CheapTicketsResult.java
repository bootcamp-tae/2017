package bootcamp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class CheapTicketsResult extends PageBase{

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


    public CheapTicketsResult(WebDriver driver){
        super(driver);
    }

    public boolean resultsExists(){
        try{
          if(resultsContainer!=null){
              return true;
          }
          else{
              return false;
          }
        }
        catch (Exception e){
            e.getStackTrace();
            return false;
        }
    }

    public CheapTicketsResult loadResult(){
        getWait().until(visibilityOfAllElements(resultLinks));
        return this;
    }

    public CheapTicketsOpenLink clickOneResult(int nResult) {
        resultLinks.get(nResult).click();
        return new CheapTicketsOpenLink(getDriver());
    }

    public CheapTicketsResult clickCheckFiveStar(){
        checkFiveStars.click();
        return this;
    }

    public CheapTicketsResult clickCheckLessThanSeventyFive(){
        checkLessThanSeventyFive.click();
        return this;
    }

    public CheapTicketsResult inputNameOfProperty(String input){
        inputNameProperty.sendKeys(input);
        return this;
    }

    public CheapTicketsResult clickSearchNameProperty(){
        btnSearchName.click();
        return this;
    }
}
