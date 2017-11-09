package firstAutomation.PageObjects;

import org.joda.time.LocalDate;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Facundo on 08/11/2017.
 */
public class CheapTicketsHomePage extends PageObjectsBase{

    private static final String CHEAPTICKETS_URL = "https://www.cheaptickets.com";

    //A element of the secondary navbar
    @FindBy(id = "tab-hotel-tab")
    private WebElement hotelsTab;

    //Form fields to complete
    @FindBy(id = "hotel-destination")
    private WebElement hotelDestination;

    @FindBy(id = "hotel-checkin")
    private WebElement hotelCheckinDate;

    @FindBy(id = "hotel-checkout")
    private WebElement hotelCheckoutDate;

    @FindBy(id = "search-button")
    private WebElement searchButton;

    //End form fields

    //Annoying advice at the top
    @FindBy(css = "#join-rewards-close-btn > span.icon.icon-close")
    private WebElement closeSecretBargains;

    //Notification element
    @FindBy(xpath = "//*[@id=\"user-alerts-menu\"]/ul/li/button")
    private WebElement bellElement;

    //"x" for close the notification element after open it
    @FindBy(xpath = "//*[@id=\"spSignIn52-delete\"]/span[1]")
    private WebElement closePopUpNotification;

    public CheapTicketsHomePage(WebDriver browser) {
        super(browser);
        browser.navigate().to(CHEAPTICKETS_URL);
    }

    public CheapTicketsHomePage closeAdvice() {
        closeSecretBargains.click();
        return this;
    }

    public CheapTicketsHomePage checkoutNotificacions() {
        bellElement.click();
        return this;
    }

    public CheapTicketsHomePage closePopUpNotification() {
        closePopUpNotification.click();
        return this;
    }

    public CheapTicketsHomePage clickOnHotelTab() {
        hotelsTab.click();
        return this;
    }

    public CheapTicketsHomePage setDestination(String dest) {
        hotelDestination.sendKeys(dest);
        return this;
    }

    public CheapTicketsHomePage chooseCheckinDate(String date) {
        enterDate(hotelCheckinDate, date);
        return this;
    }

    public CheapTicketsHomePage chooseCheckoutDate(String date) {
        enterDate(hotelCheckoutDate, date);
        return this;
    }

    public CheapTicketsResultsPage doSearch() {
        searchButton.click();
        return new CheapTicketsResultsPage(getBrowser());
    }



}
