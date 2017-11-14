package mercadolibre.inicio;

import org.junit.Test;

import com.globant.automation.bootcamp.webdriver.WebTest;

import landing.Buscar;

public class testMercado extends WebTest<Buscar> {

    @Override
    protected Buscar getInitialPage() {
	// TODO Auto-generated method stub
	return new Buscar();
    }

    @Test
    public void sample() {
	getInitialPage().busqueda().getProductos().get(2).verProducto().pregunta();

	// Buscar bus = new Buscar();
	// bus.busqueda();

	// listaBusqueda filtros = new listaBusqueda();
	// filtros.filtrarPrimerOpcion();
	// filtros.agarrarUno();

	// Pregunta pregunta = new Pregunta();
	// pregunta.pregunta();

    }

    @Override
    protected String getInitialUrl() {
	// TODO Auto-generated method stub
	return "https://www.mercadolibre.com.ar";

    }

}
