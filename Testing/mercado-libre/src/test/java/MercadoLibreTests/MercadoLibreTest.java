package MercadoLibreTests;

import com.globant.automation.bootcamp.webdriver.webdriver.WebTest;
import org.junit.Test;
import pages.MercadoLibreHome;
import pages.ProductPage;


public class MercadoLibreTest extends WebTest<MercadoLibreHome> {

    @Test
    public void search(){
        ProductPage product = getInitialPage()
                .searchProduct("IPhone8")
                .applyFilter()
                .getResults()
                .get(0)
                .select()
                .ask("Esta es una pregunta?");

        //assertThat("",,"¡Hola! Para preguntar, ingresa a tu cuenta")
    }

    @Override
    protected MercadoLibreHome getInitialPage() {
        return new MercadoLibreHome();
    }

    @Override
    protected String getInitialUrl() {
        return "https://www.mercadolibre.com.ar/";
    }

}
