package MobileTests;

import org.junit.Test;

import static org.junit.Assert.assertThat;

public class Tests extends MobileTest<AllContactsScreen>{

    @Test
    public void addContactTest(){
        ContactCard contactScreen = getInitialScreen()
                .createANewContact()
                .typeName("Daniel")
                .typeNumber("1234")
                .addNewContact();
        assertThat( "The new contact is created", contactCard.getName(),("Daniel"));
    }

    @Override
    protected AllContactsScreen getInitialScreen(){
        return new AllContactScreen();
    }

}
