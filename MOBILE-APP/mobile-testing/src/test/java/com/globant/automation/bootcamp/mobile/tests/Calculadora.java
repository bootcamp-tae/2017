package com.globant.automation.bootcamp.mobile.tests;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.globant.automation.bootcamp.webdriver.mobile.MobileTest;

import calculadoraPages.calculadoraActividad;

public class Calculadora extends MobileTest<calculadoraActividad> {

    @Test
    public void addTest() {
	getInitialPage().cinco().multiplicar().tres().sumar().cinco().restar().tres().elResultadoEs();
    }

    @Override
    protected calculadoraActividad getInitialPage() {
	return new calculadoraActividad();
    }

    @Override
    protected void setCapabilities(DesiredCapabilities capabilities) {
	capabilities.setCapability("appPackage", "com.android.calculator2");
	capabilities.setCapability("appActivity", ".Calculator");
    }

}
