package bootcamp.pages.landing;

import bootcamp.Elements.PageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tabs extends PageBase{

    @FindBy(xpath = "//*[@id=\"wizard-theme-wrapper\"]/ul/li[2]")
    private WebElement hotelBtn;

    public Hotels toHotels() {
        hotelBtn.click();
        return new Hotels();
    }
}
