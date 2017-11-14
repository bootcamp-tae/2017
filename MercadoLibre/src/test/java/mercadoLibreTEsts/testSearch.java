package mercadoLibreTEsts;

import bootcamp.Elements.WebTest;
import bootcamp.PageComponents.Items;
import bootcamp.landing.MercadoLibreHome;
import org.junit.Test;

import static bootcamp.PageComponents.Filters.Condition.NEW;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;

public class testSearch extends WebTest<MercadoLibreHome>{

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
                .search("camiseta")
                .filter().byCondition(NEW)
                .getItems()
                .get(1);

        assertThat("item name is not empty", items.getName(), not(isEmptyString()));

        items.select()
                .enterQuestion("como hago para comprar")
                .sendQuestion();
    }
}
