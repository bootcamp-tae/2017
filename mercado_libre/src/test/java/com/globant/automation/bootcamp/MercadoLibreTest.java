package com.globant.automation.bootcamp;

import com.globant.automation.bootcamp.pages.landing.Home;
import com.globant.automation.bootcamp.pages.products.ProductCard;
import com.globant.automation.bootcamp.webdriver.WebTest;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by Facundo on 13/11/2017.
 */
public class MercadoLibreTest extends WebTest<Home> {

    @Test
    public void commentProduct() {
        ProductCard product = getInitialPage()
                .navbar()
                .setSearchText("Asus")
                .seeResults()
                .onlyNews()
                .getProducts()
                .get(1);
        assertThat("Product has a name", product.getProductName(), not(isEmptyString()));
        assertThat("Product has a price", product.getProductPrice(), is(greaterThan(0d)));

        product.getProductDetails()
                .getQuestionSection()
                .writeQuestion("Are u a proffesional?")
                .sendQuestion()
                .sayImNew()
                .writeEmail("kimmiraikkonen@f1.com");
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
