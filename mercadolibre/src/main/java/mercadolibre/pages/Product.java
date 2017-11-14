package mercadolibre.pages;

import com.globant.automation.bootcamp.webdriver.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product extends Page {

    @FindBy(id = "question")
    private WebElement questionBox;

    @FindBy(id= "question-btn")
    private WebElement questionButton;

    public Register ask(String question){
        type(questionBox, question);
        click(questionButton);
        return new Register();
    }
}
