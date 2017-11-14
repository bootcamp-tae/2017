package com.globant.automation.bootcamp.ui.pages.mercadolibre;

import com.globant.automation.bootcamp.webdriver.WebTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.grid.internal.DefaultGridRegistry;

import java.util.List;



public class SearchMercadoLibreTest extends WebTest<Home> {

    @Test
    public void searchTest(){
        Home mercadoLibreHomePage = getInitialPage();
        SearchResults results = mercadoLibreHomePage.search("Samsung S7");
        results = results.filter();
        List<ProductCard> productCards = results.getResults();
        ProductCard productCard = productCards.get(2);
        ProductDetails productDetails = productCard.select();
        LoginForm loginForm = productDetails.askQuestion("Do you have this item in stock?");

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
