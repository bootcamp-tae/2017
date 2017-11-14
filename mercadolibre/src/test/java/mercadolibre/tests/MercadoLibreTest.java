package mercadolibre.tests;

import com.globant.automation.bootcamp.webdriver.WebTest;
import mercadolibre.pages.Home;
import mercadolibre.pages.Register;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MercadoLibreTest extends WebTest<Home> {

    private final String SEARCH = "Core i7";
    private final String FILTER = "Nuevo";
    private final String QUESTION = "What's up?";

    @Test
    public void test() {
        Register register = getInitialPage()
                .search(SEARCH)
                .applyFilter(FILTER)
                .getProducts()
                .get(0)
                .choose()
                .ask(QUESTION);

        assertThat("Page contains text", register.getText(), containsString("¡Hola! Para preguntar, ingresa a tu cuenta"));
    }

    @Override
    protected Home getInitialPage() {
        return new Home();
    }

    @Override
    protected String getInitialUrl() {
        return "https://www.mercadolibre.com.ar/";
    }
}
