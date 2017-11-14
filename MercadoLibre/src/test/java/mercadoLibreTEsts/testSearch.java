package mercadoLibreTEsts;

import bootcamp.Elements.WebTest;
import bootcamp.landing.Items;
import bootcamp.landing.MercadoLibreHome;
import bootcamp.model.MercadoBuilder;
import org.junit.Test;

import static bootcamp.landing.Filters.Condition.NEW;
import static bootcamp.model.MercadoBuilder.Builder.mercadoCriteria;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;

public class testSearch extends WebTest<MercadoLibreHome>{

    private final MercadoBuilder mercadoBuilder= mercadoCriteria()
            .setSearchItem("camiseta")
            .build();

    @Override
    protected MercadoLibreHome getInitialPage() {
        return new MercadoLibreHome();
    }

    @Override
    protected String getUrl() {
        return "https://www.mercadolibre.com.ar";
    }

    @Test
    public void testSearch(){
        Items items=getInitialPage()
                .getBar()
                .search(mercadoBuilder)
                .filter().byCondition(NEW)
                .getItems()
                .get(1);

        assertThat("item name is not empty", items.getName(), not(isEmptyString()));

        items.select()
                .enterQuestion("como hago para comprar")
                .sendQuestion();
    }
}
