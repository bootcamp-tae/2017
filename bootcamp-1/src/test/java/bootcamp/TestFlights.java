package bootcamp;


import components.WebTest;
import bootcamp.model.FlightBuilder;
import bootcamp.pages.components.Flights.FlightCard;
import bootcamp.pages.landing.CheapTicketsHome;
import org.junit.Test;

import static bootcamp.model.FlightBuilder.Builder.flightCriteria;

public class TestFlights extends WebTest<CheapTicketsHome>{

    private final FlightBuilder flightSearch= flightCriteria()
            .setOrigin("Buenos Aires, Argentina (EZE-Ministro Pistarini Intl.)")
            .setDestination("Miami (and vicinity), Florida, United States of America")
            .setDateDeparting(25)
            .setAdults(1)
            .setChildren(0)
            .build();


    @Override
    protected CheapTicketsHome getInitialPage() {
        return new CheapTicketsHome();
    }

    @Override
    protected String getUrl() {
        return "https://www.cheaptickets.com/";
    }

    @Test
    public void testSearch(){
        FlightCard flight=getInitialPage()
                .tabsBar()
                .toFlights()
                .search(flightSearch)
                .getFlights()
                .get(1);
    }
}
