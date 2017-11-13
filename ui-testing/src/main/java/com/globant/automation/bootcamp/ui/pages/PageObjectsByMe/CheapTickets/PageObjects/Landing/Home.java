package com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.Landing;

import com.globant.automation.bootcamp.ui.pages.PageObjectsByMe.CheapTickets.PageObjects.CheapTicketsPage;

public class Home extends CheapTicketsPage {

    private PrimarySiteHeader primarySiteHeader = new PrimarySiteHeader();
    private Tabs tabs = new Tabs();

    public Tabs tabsBar() {
        return tabs;
    }
    public PrimarySiteHeader primarySiteHeader(){
        return  primarySiteHeader;
    }
}