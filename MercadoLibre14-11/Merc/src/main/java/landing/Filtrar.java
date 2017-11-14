package landing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.globant.automation.bootcamp.webdriver.Page;

public class Filtrar extends Page {

    @FindBy(xpath = "//*[@id='id_category']/dd[1]/h3/a")
    private WebElement filtroUno;

    @FindBy(xpath = "//*[@id='id_condition']/dd[1]/a")
    private WebElement condicion;

    public listaBusqueda clickearNuevo() {
	click(condicion);
	return new listaBusqueda();
    }
}
