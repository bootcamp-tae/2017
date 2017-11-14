package lista;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.globant.automation.bootcamp.webdriver.Component;

import landing.Pregunta;

public class producto extends Component {

    @FindBy(className = "main-title")
    private WebElement tarjeta;

    public producto(WebElement rootElement) {
	super(rootElement);
    }

    public Pregunta verProducto() {
	click(tarjeta);
	return new Pregunta();
    }
}
