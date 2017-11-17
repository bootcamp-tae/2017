package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends MercadoLibreHome{

    @FindBy(id = "question")
    private WebElement questionBar;

    @FindBy(id = "question-btn")
    private WebElement questionButton;

    public LogInPage ask(String question){
        type(questionBar, question);
        click(questionButton);
        return new LogInPage();
    }
}
