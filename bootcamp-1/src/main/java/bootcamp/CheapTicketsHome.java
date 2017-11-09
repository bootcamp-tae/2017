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

    //CALLING FROM TEST

    public CheapTicketsHome enterSearch(String hotelDestino){
        search.sendKeys(hotelDestino + Keys.TAB);
        return this;
    }

    public CheapTicketsHome clickTabHotel(){
        hotelBtn.click();
        return this;
    }

    public CheapTicketsResult clickSearchButton(){
        searchButton.sendKeys(Keys.ENTER);
        return new CheapTicketsResult(getDriver());
    }

    public CheapTicketsHome clickCheckFlight(){
        checkFlight.click();
        return this;
    }

    public CheapTicketsHome clickCheckCar(){
        checkCar.click();
        return this;
    }

    public CheapTicketsHome inputFirstDate(String input){
        this.enterData(dateInputFirst,input);
        return this;
    }

    public CheapTicketsHome inputLastDate(String input){
        this.enterData(dateInputLast,input);
        return this;
    }

    public CheapTicketsHome inputHotelRooms(String input){
        this.enterData(hotelRooms,input);
        return this;
    }

    public CheapTicketsHome inputHotelAdults(String input){
        this.enterData(hotelAdults,input);
        return this;
    }

    public CheapTicketsHome inputHotelChildren(String input){
        this.enterData(hotelChildrens,input);
        return this;
    }


}
