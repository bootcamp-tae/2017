import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Files;

class HotelView extends InitialPage{

    @FindBy(id = "hotel-destination")
    WebElement destinationSearchBox;

    @FindBy(id = "hotel-checkin")
    WebElement checkinBox;

    @FindBy(id = "hotel-checkout")
    WebElement checkoutBox;

    @FindBy(id = "hotel-rooms")
    WebElement roomSelector;

    public HotelView(WebDriver driver){
        super(driver);
    }

    public WebElement getDestinationSearchBox(){
        return this.destinationSearchBox;
    }

    public WebElement getCheckinBox() {
        return checkinBox;
    }

    public WebElement getCheckoutBox() {
        return checkoutBox;
    }

    public HotelView selectRooms(String value){
        Select roomSelect = new Select(this.roomSelector);
        roomSelect.selectByValue(value);
        return this;
    }

    public WebElement getRoomSelector(){
        return this.roomSelector;
    }

}
