
import Pages.MercadoHome;
import Junit.ParametrizedParallelism;
import WebDriver.WebTest;
import org.junit.Test;
import org.junit.runner.RunWith;

import Pages.ProductPage;

import static org.junit.Assert.assertThat;

public class MercadoTesting extends WebTest<MercadoHome> {

    @Test
    public void search(){
        ProductPage product = getInitialPage()
                .searchProduct("Tv Led")
                .applyFilter()
                .getResults()
                .get(0)
                .select()
                .ask("Hay Stock?");


    }

    @Override
    protected MercadoHome getInitialPage() {
        return new MercadoHome();
    }

    @Override
    protected String getInitialUrl() {
        return "https://www.mercadolibre.com.ar/";
    }

}