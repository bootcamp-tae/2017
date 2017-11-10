package com.globant.automation.bootcamp.ui.cheaptickets.pages.landing;

import com.globant.automation.bootcamp.ui.cheaptickets.pages.CheapTicketsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Facundo on 10/11/2017.
 */
public class NotificationIcon extends CheapTicketsPage {

    @FindBy(css = "#user-alerts-menu > ul > li > button")
    WebElement bellNotification;

    public NotificationTooltip checkoutNotifications() {
        click(bellNotification);
        return new NotificationTooltip();
    }

}
