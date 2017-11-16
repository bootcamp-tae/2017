package ScreenObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AllContactsScreen extends ContactsScreen{

    @AndroidFindBy(id = ANDROID_CONTACTS_PREFIX + "create_contact_button")
    private MobileElement createContactButton;

    public AllContactsScreen(){
        waitFor(visibilityOf(createContactButton));
    }

    public MessageBackUp createANewContact(){
        click(createContactButton);
        return new MessageBackUp();
    }
}
