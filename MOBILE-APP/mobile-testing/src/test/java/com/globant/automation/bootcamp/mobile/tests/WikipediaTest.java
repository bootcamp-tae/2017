package com.globant.automation.bootcamp.mobile.tests;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.globant.automation.bootcamp.webdriver.mobile.MobileTest;

import wikipediaPages.Busqueda;

public class WikipediaTest extends MobileTest<Busqueda> {
    /////////////////// LISTA ERROR /////////////////////
    @Test
    public void addTest() {
	// getInitialPage().clickbuscar().buscar().getResultados().get(4).select();
	getInitialPage().clickbuscar().buscar().primerElementoBusqueda();
	// ListaResultados m = new ListaResultados();
	// m.getResultados().get(0).select();

	// assertThat("parque?", busqueda, is("parque"));

    }

    @Override
    protected Busqueda getInitialPage() {
	return new Busqueda();
    }

    @Override
    protected void setCapabilities(DesiredCapabilities capabilities) {
	capabilities.setCapability("appPackage", "org.wikipedia");
	capabilities.setCapability("appActivity", ".main.MainActivity");
    }
}
