package com.globant.automation.bootcamp.ui.cheaptickets.pages.landing;

import com.globant.automation.bootcamp.ui.cheaptickets.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Facundo on 10/11/2017.
 */
public class NotificationTooltip extends CheapTicketsPage {

    @FindBy(id = "spSignIn52-delete")
    WebElement crossTooltip;

    public WizardContainer closeNotificationTooltip() {
        click(crossTooltip);
        return new WizardContainer();
    }

}
