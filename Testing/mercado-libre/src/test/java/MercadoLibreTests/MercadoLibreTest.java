package MercadoLibreTests;

import com.globant.automation.bootcamp.webdriver.webdriver.WebTest;
import org.junit.Test;
import pages.LogInPage;
import pages.MercadoLibreHome;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class MercadoLibreTest extends WebTest<MercadoLibreHome> {

    @Test
    public void search(){
        LogInPage logIn = getInitialPage()
                .searchProduct("IPhone8")
                .applyFilter()
                .getResults()
                .get(0)
                .select()
                .ask("Esta es una pregunta?");

        assertThat("Se realizo los pasos correctos", logIn.getMessage(), is("¡Hola! Para preguntar, ingresa a tu cuenta"));
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
