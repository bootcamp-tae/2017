package bootcamp.PageComponents;

import bootcamp.Elements.WebComponent;
import bootcamp.MercadoLibrePage;
import bootcamp.landing.ItemDetails;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Items extends WebComponent {

    @FindBy(className = "item__info-title")
    private WebElement itemLink;

    @FindBy(className = "main-title")
    private WebElement name;


    public Items(WebElement container) {
        super(container);
    }

    public ItemDetails select() {
        click(itemLink);
        return new ItemDetails();
    }

    public String getName(){
        return getText(name);
    }
}
