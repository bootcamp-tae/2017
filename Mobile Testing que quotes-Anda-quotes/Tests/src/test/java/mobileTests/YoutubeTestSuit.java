package mobileTests;


import framework.mobile.MobileTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageObjects.YoutubePage;

public class YoutubeTestSuit extends MobileTest<YoutubePage> {

    @Test
    public void makeAnEvent(){

        YoutubePage mainView = new YoutubePage();
        mainView.search()
                    .write("something")
                    .pickOption(1)
                        .pickVideo(2)
                            .like();
    }


    @Override
    public void setCapabilities(DesiredCapabilities capabilities){
        capabilities.setCapability("appPackage", "com.google.android.youtube");
        capabilities.setCapability("appActivity", "com.google.android.apps.youtube.app.WatchWhileActivity");
        //capabilities.setCapability("appPackage", "com.google.android.calendar");
        //capabilities.setCapability("appActivity", "com.google.android.calendar.AllInOneCalendarActivity");
    }


}
