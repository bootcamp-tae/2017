package MobileTests;

import ScreenObjects.AllContactsScreen;
import ScreenObjects.ContactCardScreen;
import com.globant.automation.bootcamp.webDriver.Mobile.MobileTest;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Tests extends MobileTest<AllContactsScreen> {

    @Test
    public void addFirstContactTest(){
        ContactCardScreen contactScreen = getInitialScreen()
                .createANewContact()
                .selectKeepLocal()
                .typeName("Daniel")
                .typeNumber("1234")
                .addNewContact();
        assertThat( "The new contact is created", contactScreen.getNumber(), is("1 234"));
    }

    @Override
    protected AllContactsScreen getInitialScreen(){
        return new AllContactsScreen();
    }

    @Override
    public void setCapabilities(DesiredCapabilities capabilities) {
        capabilities.setCapability("appPackage", "com.android.contacts");
        capabilities.setCapability("appActivity", ".activities.PeopleActivity");
    }


}
