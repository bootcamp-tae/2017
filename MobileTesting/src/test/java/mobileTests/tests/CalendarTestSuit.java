package mobileTests.tests;

import framework.mobile.MobileTest;
import pages.YoutubePage;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CalendarTestSuit extends MobileTest<YoutubePage>{

    @Test
    public void makeAnEvent(){

        YoutubePage mainView = new YoutubePage();
        mainView.search()
                    .write("something")
                    .pickOption(1)
                        .pickVideo(2)
                            .like();
    }


    @BeforeClass
    @Override
    public void setCapabilities(DesiredCapabilities capabilities){
        capabilities.setCapability("appPackage", "com.google.android.calendar");
        capabilities.setCapability("appActivity", "com.google.android.calendar.AllInOneCalendarActivity");
    }


}
