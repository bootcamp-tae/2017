package PageObjects.Products;

import PageObjects.MercadoLibrePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends MercadoLibrePage {
    @FindBy (id = "question")
    private WebElement questionField;

    @FindBy (id = "question-btn")
    private WebElement questionButton;


    public HaveAccount askQuestion(String question) {
        type(questionField, question);
        click(questionButton);
        return new HaveAccount();
    }
}
