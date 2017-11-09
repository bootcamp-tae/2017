import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

class HotelView extends InitialPage{

    @FindBy(id = "hotel-destination")
    WebElement destinationSearchBox;

    @FindBy(id = "hotel-checkin")
    WebElement checkinBox;

    @FindBy(id = "hotel-checkout")
    WebElement checkoutBox;

    @FindBy(id = "hotel-rooms")
    WebElement roomSelector;

    @FindBy(id = "search-button")
    WebElement searchButton;

    List<WebElement> kidsPerRoom;
    List<WebElement> adultsPerRoom;


    public HotelView(WebDriver driver){
        super(driver);
        kidsPerRoom = new ArrayList<>();
        adultsPerRoom = new ArrayList<>();
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

    public HotelView selectRooms(int value) {
        Select roomSelect = new Select(this.roomSelector);
        roomSelect.selectByValue(String.valueOf(value));
        if (value < 9){
            String idToSearch;
            for (int i = 1; i <= value; ) {
                idToSearch = "hotel-"+i+"-children";
                kidsPerRoom.add(getDriver().findElement(By.id(idToSearch)));
            }
            for (int i = 1; i <= value; i++) {
                idToSearch = "hotel-"+i+"-adults";
                adultsPerRoom.add(getDriver().findElement(By.id(idToSearch)));
            }
        }
        return this;
    }

    public WebElement getRoomSelector(){
        return this.roomSelector;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public HotelView pickAdultsOnRoom(int adults, int room) {
            Select adultsSelector = new Select(adultsPerRoom.get(room));
            adultsSelector.selectByValue(String.valueOf(adults));
        return this;
    }

    public HotelView pickKidsOnRoom(int kids, int room) {
            Select kidsSelector = new Select(kidsPerRoom.get(room));
            kidsSelector.selectByValue(String.valueOf(room));
        return this;
    }
}
