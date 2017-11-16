import framework.WebDriver.Page;

public class CheapTicketHome extends Page {

    Tabs tabs;

    public CheapTicketHome(){
        super();
        //getDriver().get("https://www.cheaptickets.com/");
    }

    public Tabs getTabBar(){
        return this.tabs;
    }

}
