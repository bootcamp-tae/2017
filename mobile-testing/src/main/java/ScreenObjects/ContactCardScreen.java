package ScreenObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class ContactCardScreen extends ContactsScreen {

    @AndroidFindBy(id = "header")
    private MobileElement number;

    public String getNumber() {
        waitFor(visibilityOf(number));
        return number.getText();
    }
}
