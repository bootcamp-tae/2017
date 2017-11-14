package com.globant.automation.bootcamp.ui.pages.mercadolibre;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails extends MLPage{


    @FindBy(id = "question")
    private WebElement questionBox;

    @FindBy(id = "question-btn")
    private WebElement questionBtn;


    public LoginForm askQuestion(String questionToAsk) {
        type(questionBox,questionToAsk);
        click(questionBtn);
        return new LoginForm();
    }
}
