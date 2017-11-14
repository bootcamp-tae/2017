package landing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.globant.automation.bootcamp.webdriver.Page;

public class Buscar extends Page {

    @FindBy(xpath = "/html/body/header/div/form/input")
    private WebElement barra;

    @FindBy(xpath = "/html/body/header/div/form/button[3]/i")
    private WebElement lupa;

    public Filtrar busqueda() {
	barra.sendKeys("coches");
	click(lupa);
	return new Filtrar();
    }

}
