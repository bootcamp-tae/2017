package landing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.globant.automation.bootcamp.webdriver.Page;

public class Pregunta extends Page {

    @FindBy(id = "question")
    private WebElement pregunta;

    @FindBy(id = "question-btn")
    private WebElement mandarPreguta;

    public void pregunta() {
	pregunta.sendKeys("compro carro");
	click(mandarPreguta);
    }

}
