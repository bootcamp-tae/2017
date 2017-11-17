package com.globant.automation.bootcamp.mobile.tests;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.globant.automation.bootcamp.webdriver.mobile.MobileTest;

import gmailPages.BaseGmail;
import gmailPages.InicioGmail;

public class GmailTest extends MobileTest<BaseGmail> {
    @Test
    public void addTest() {
	getInitialPage().empezar().clickIrAGmail().getResultados().get(2).select();
	// getInitialPage().empezar().clickIrAGmail();

    }

    @Override
    protected InicioGmail getInitialPage() {
	return new InicioGmail();
    }

    @Override
    protected void setCapabilities(DesiredCapabilities capabilities) {
	capabilities.setCapability("appPackage", "com.google.android.gm");
	capabilities.setCapability("appActivity", ".ConversationListActivityGmail");
    }

}
