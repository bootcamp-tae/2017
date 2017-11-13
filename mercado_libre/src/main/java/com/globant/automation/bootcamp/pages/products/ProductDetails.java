package com.globant.automation.bootcamp.pages.products;

import com.globant.automation.bootcamp.MercadoLibrePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Facundo on 13/11/2017.
 */
public class ProductDetails extends MercadoLibrePage {

    private final QuestionsSection questionSection;

    @FindBy(css = "[data-component=\"question\"]")
    private WebElement questionsSection;

    public ProductDetails() {
        waitFor(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[data-component='question']")));
        this.questionSection = new QuestionsSection(questionsSection);
    }

    public QuestionsSection getQuestionSection() {
        return questionSection;
    }
}
