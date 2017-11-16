package GriPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class CheapTickets extends Page{

    @FindBy(id = "tab-hotel-tab")
    private WebElement hotels;

    @FindBy(id = "hotel-destination")
    private WebElement place;

    @FindBy(id = "hotel-checkin")
    private WebElement CheckIn;

    @FindBy (id = "hotel-checkout")
    private WebElement CheckOut;

    @FindBy (id = "hotel-rooms")
    private WebElement Rooms;

    @FindBy (id = "hotel-1-adults")
    private WebElement Adults;

    @FindBy(id = "search-button")
    private WebElement Submit;

    @FindBy(css = "#\\32 651 > div.flex-card > div.flex-link-wrap > a > span")
    private WebElement names;



    public CheapTickets (WebDriver driver){
        super(driver);
    }

    public CheapTickets clickHotels ()
    {
        hotels.click();
        return this;
    }

    public CheapTickets chargeInputs(String placeofhotel,String dateIn, String dateOut, String adults, String rooms ){
        int f = 0;
        enterDate(CheckIn,dateIn);
        enterDate(CheckOut,dateOut);
        new Select(Rooms).selectByVisibleText(rooms);
        if(rooms.compareTo("1")==1)
        {
            int value = Integer.getInteger(rooms);
            List<WebElement> manyadults = new ArrayList(0);
            List<WebElement> childrens = new ArrayList(0);
          for(int i = 1; i< value; i++){
              String idSearching = "hotel-"+i+"-adults";
              manyadults.add(super.getDriver().findElement(By.id(idSearching)));
          }
          for(int i = 1; i< value; i++){
             String idSearching = "hotel-"+i+"-children";
             childrens.add(super.getDriver().findElement(By.id(idSearching)));
            }

        }

        new Select(Adults).selectByVisibleText(adults);
        place.sendKeys(placeofhotel + Keys.ENTER);
        //Submit.click();
        return this;
    }

    public CheapTickets selectHotel(WebDriver driver){
       List<WebElement> results = super.getDriver().findElements(By.cssSelector("#\\32 651 > div.flex-card.visited-hotel > div.flex-link-wrap > a"));
       results.get(5).click();
       return this;
    }


}
