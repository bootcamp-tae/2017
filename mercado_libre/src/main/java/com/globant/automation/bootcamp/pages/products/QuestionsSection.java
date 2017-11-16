package com.globant.automation.bootcamp.pages.products;

import com.globant.automation.bootcamp.pages.login.AreYouNew;
import com.globant.automation.bootcamp.webdriver.web.Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Facundo on 13/11/2017.
 */
public class QuestionsSection extends Component {

    @FindBy(id = "question")
    private WebElement questionInput;

    @FindBy(id = "question-btn")
    private WebElement questionButton;

    protected QuestionsSection(WebElement container) {
        super(container);
    }

    public QuestionsSection writeQuestion(String question){
        sendKeys(questionInput, question);
        return this;
    }

    public AreYouNew sendQuestion(){
        click(questionButton);
        return new AreYouNew();
    }



}
