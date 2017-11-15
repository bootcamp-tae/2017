package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends MercadoHome{

    @FindBy(id = "question")
    private WebElement questionBar;

    @FindBy(id = "question-btn")
    private WebElement questionButton;

    public ProductPage ask(String question){
        type(questionBar, question);
        return this;
    }
}