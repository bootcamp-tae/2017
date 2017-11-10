package com.globant.automation.bootcamp.ui.cheaptickets.pages.landing;

import com.globant.automation.bootcamp.ui.cheaptickets.pages.CheapTicketsPage;

public class WizardContainer extends CheapTicketsPage {

    private SecondNavbar SecondNavbar = new SecondNavbar();

    public SecondNavbar tabsBar() {
        return SecondNavbar;
    }
}
