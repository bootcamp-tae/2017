package bootcamp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.awt.SunHints;

public class CheapTicketsHome extends PageBase{


    @FindBy(xpath = "//*[@id=\"wizard-theme-wrapper\"]/ul/li[2]")
    private WebElement hotelBtn;

    @FindBy(id = "hotel-destination")
    private WebElement search;

    @FindBy(id="hotel-checkin")
    private WebElement dateInputFirst;

    @FindBy(id="hotel-checkout")
    private WebElement dateInputLast;

    @FindBy(id="search-button")
    private WebElement searchButton;

    @FindBy(id="hotel-rooms")
    private WebElement hotelRooms;

    @FindBy(id="hotel-1-adults")
    private WebElement hotelAdults;

    @FindBy(id="hotel-1-children")
    private WebElement hotelChildrens;


    @FindBy(id="hotel-add-flight-checkbox")
    private WebElement checkFlight;

    @FindBy(id="hotel-add-car-checkbox")
    private WebElement checkCar;

    public CheapTicketsHome(WebDriver driver){
        super(driver);
    }

    public CheapTicketsResult doSearch(String hotelDestino, String inDate, String outDate,String rooms, String nAdults,String nChilds){
       try {
           hotelBtn.click();
           search.sendKeys(hotelDestino + Keys.TAB);
           enterFirstDate(inDate);
           enterLastDate(outDate);
           enterHotelRooms(rooms);
           enterHotelAdults(nAdults);
           enterHotelChildren(nChilds);
           //checkFlight.click();
           //checkCar.click();
           searchButton.sendKeys(Keys.ENTER);
           return new CheapTicketsResult(getDriver());
       }
       catch (Exception e){
           e.getStackTrace();
           return null;
       }
    }

    public void enterFirstDate(String input){
        this.enterData(dateInputFirst,input);
    }

    public void  enterLastDate(String input){
        this.enterData(dateInputLast,input);
    }

    public void enterHotelRooms(String input){
        this.enterData(hotelRooms,input);
    }

    public void enterHotelAdults(String input){
        this.enterData(hotelAdults,input);
    }

    public void enterHotelChildren(String input){
        this.enterData(hotelChildrens,input);
    }



}
