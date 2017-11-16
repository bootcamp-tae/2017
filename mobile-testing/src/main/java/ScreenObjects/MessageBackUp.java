package ScreenObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MessageBackUp extends ContactsScreen {
    @AndroidFindBy(id = ANDROID_CONTACTS_PREFIX + "left_button")
    private MobileElement keepLocalButton;

    public CreateContactScreen selectKeepLocal(){
        click(keepLocalButton);
        return new CreateContactScreen();
    }
}
