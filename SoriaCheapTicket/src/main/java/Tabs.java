import WebDriver.Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tabs extends Component{


    @FindBy
    private WebElement hotelButton;

    Tabs(WebElement container) {
        super(container);
    }

    public Tabs clickHotels(){
        click(hotelButton);
        return this;
    }
}
