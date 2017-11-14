package MercadoLibreTests;

import PageObjects.Landing.Home;
import PageObjects.Products.FiltersComponent;
import PageObjects.Products.HaveAccount;
import com.globant.automation.bootcamp.webDriver.WebTest;
import org.junit.Test;

import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;


public class Tests extends WebTest<Home> {

    @Test
    public void tryAskQuestionWithoutAccount(){
        HaveAccount haveAccount = getInitialPage()
                .inNavigationBar()
                .searchProduct("auto bonito")
                .filter()
                .byCondition(FiltersComponent.Conditions.NEW)
                .atTheProductResults()
                .selectProduct(1)
                .goToDetails()
                .askQuestion("este auto se vende?");

        assertThat("An account is needed", haveAccount.getSoyNuevo(), not(isEmptyOrNullString()));
    }

    @Override
    protected Home getInitialPage() {
        return new Home();
    }

    @Override
    protected String getInitialUrl() {
        return "https://www.mercadolibre.com.ar";
    }
}
