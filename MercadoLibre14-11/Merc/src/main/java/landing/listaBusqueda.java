package landing;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.globant.automation.bootcamp.webdriver.Page;

import lista.producto;

public class listaBusqueda extends Page {

    @FindBy(css = "li.results-item")
    private WebElement listar;

    @FindBy(css = "li.results-item")
    private List<WebElement> link;

    public Pregunta filtrarPrimerOpcion() {

	return new Pregunta();
    }

    public List<producto> getProductos() {

	return link.stream().map(producto::new).collect(toList());

    }

    // public List<HotelCard> getHotels() {
    // seleccionarEstrellas();
    // seleccionarPrecio();
    // waitFor(visibilityOfAllElements(hotels));
    // return hotels.stream().map(HotelCard::new).collect(toList());
    // }

}
