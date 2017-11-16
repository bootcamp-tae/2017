package ScreenObjects;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateContactScreen extends ContactsScreen {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    private MobileElement nameElement;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
    private MobileElement phoneElement;

    @AndroidFindBy(id = "save_menu_item")
    private MobileElement saveContact;

    public CreateContactScreen typeName(String name){
        type(nameElement, name);
        return this;
    }

    public CreateContactScreen typeNumber(String phone){
        type(phoneElement, phone);
        return this;
    }

    public ContactCardScreen addNewContact(){
        click(saveContact);
        return new ContactCardScreen();
    }
}
