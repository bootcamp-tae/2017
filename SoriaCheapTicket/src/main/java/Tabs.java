import WebDriver.Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tabs extends Component{


    @FindBy(id="tab-hotel-tab")
    private WebElement hotelButton;

    Tabs(WebElement container) {
        super(container);
    }

    public HotelsTabPanel clickHotels(){
        click(hotelButton);
        return new HotelsTabPanel(this);
    }
}
