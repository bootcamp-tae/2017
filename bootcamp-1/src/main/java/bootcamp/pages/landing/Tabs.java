package bootcamp.pages.landing;

import bootcamp.Elements.Page;
import bootcamp.Elements.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tabs extends Page {

    @FindBy(id = "tab-hotel-tab")
    private WebElement hotelBtn;

    public Hotels toHotels() {
        click(hotelBtn);
        return new Hotels();
    }
}
