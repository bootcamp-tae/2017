package bootcamp.landing;

import bootcamp.MercadoLibrePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemDetails extends MercadoLibrePage{

    @FindBy(id = "question")
    private WebElement inputQuestion;

    @FindBy(id = "question-btn")
    private WebElement btnQuestion;

    public ItemDetails enterQuestion(String question){
        type(inputQuestion, question);
        return this;
    }

    public void sendQuestion(){
        click(btnQuestion);
    }
}
