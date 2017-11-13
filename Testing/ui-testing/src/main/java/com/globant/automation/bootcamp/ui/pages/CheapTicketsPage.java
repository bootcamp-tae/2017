package com.globant.automation.bootcamp.ui.pages;

import com.globant.automation.bootcamp.webdriver.webdriver.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 * Clase que contiene lo comun a todas las paginas de Cheap Tickets
 */
public class CheapTicketsPage extends Page {

    protected void enterDate(WebElement element, String date) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].value = arguments[1];", element, date);
    }

}