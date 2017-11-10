package com.globant.automation.bootcamp.ui.cheaptickets.pages.landing;

import com.globant.automation.bootcamp.ui.cheaptickets.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Facundo on 10/11/2017.
 */
public class DontWannaSaveExtra extends CheapTicketsPage{

    @FindBy(css = "#join-rewards-close-btn > span.icon.icon-close")
    WebElement crossForClose;

    public WizardContainer closeAdvice() {
        click(crossForClose);
        return new WizardContainer();
    }

}
