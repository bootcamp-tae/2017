package landing;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.globant.automation.bootcamp.webdriver.Page;

import lista.producto;

public class listaBusqueda extends Page {

    @FindBy(xpath = "//*[@id='id_category']/dd[1]/h3/a")
    private WebElement filtroUno;
    @FindBy(css = "li.results-item")
    private WebElement listar;

    @FindBy(xpath = "//*[@id='id_condition']/dd[1]/a")
    private WebElement condicion;

    @FindBy(css = "li.results-item")
    private List<WebElement> link;

    public Pregunta filtrarPrimerOpcion() {
	click(filtroUno);
	return new Pregunta();
    }

    public void clickearNuevo() {
	click(condicion);
    }

    public List<producto> getProductos() {
	clickearNuevo();
	return link.stream().map(producto::new).collect(toList());

    }

    // public List<HotelCard> getHotels() {
    // seleccionarEstrellas();
    // seleccionarPrecio();
    // waitFor(visibilityOfAllElements(hotels));
    // return hotels.stream().map(HotelCard::new).collect(toList());
    // }

}
