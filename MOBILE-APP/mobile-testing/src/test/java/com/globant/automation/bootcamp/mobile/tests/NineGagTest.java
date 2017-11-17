package com.globant.automation.bootcamp.mobile.tests;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.globant.automation.bootcamp.webdriver.mobile.MobileTest;

import nineGagPPages.inicioNineGag;

public class NineGagTest extends MobileTest<inicioNineGag> {

    @Test
    public void addTest() {
	getInitialPage().irATrending().irAHot().irAHome();
	// assertThat("parque?", busqueda, is("parque"));

    }

    @Override
    protected inicioNineGag getInitialPage() {
	return new inicioNineGag();
    }

    @Override
    protected void setCapabilities(DesiredCapabilities capabilities) {
	capabilities.setCapability("appPackage", "com.ninegag.android.app");
	capabilities.setCapability("appActivity", "ui.HomeActivity");
    }
}
