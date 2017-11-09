package com.globant.automation.bootcamp.ui.pages;

public abstract class Page {

    private final WebDriver driver;

    protected Page(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    protected WebDriver getDriver() { // Se lo declara protected para que el test no lo pueda acceder y no se exponga
                                      // la
        return driver;
    }
}
