package deskClock.activities.screens;

import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;

public class InitialScreen extends MobilePage {

    private Tabs tabs = new Tabs();

    public Tabs getTabsBar() {

        return tabs;
    }
}
