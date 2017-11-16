package mobileTests.tests;

import mobile.MobileTest;
import mobileTests.pages.CalendarPage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CalendarTestSuit extends MobileTest {


    @Test
    public void makeAnEvent(){

        CalendarPage mainView = new CalendarPage();
        mainView.PickDate(10)
                    .pressAdd()
                        .Event()
                            .setTitle("automatedEvent")
                            .allDay()
                            .setColor("mandarina")
                            .addNote("Este evento se ha hecho automaticamente.")
                            .Save();
    }



    @BeforeClass
    @Override
    protected void setCapabilities(DesiredCapabilities capabilities){
        capabilities.setCapability("appPackage", );
        capabilities.setCapability("appActivity", );
    }


}
