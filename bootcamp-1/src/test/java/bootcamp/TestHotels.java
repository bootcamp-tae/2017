package bootcamp;

import bootcamp.Elements.WebTest;
import bootcamp.model.HotelBuilder;
import bootcamp.pages.components.Hotels.HotelCard;
import bootcamp.pages.landing.CheapTicketsHome;
import logging.Logging;
import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static bootcamp.model.HotelBuilder.Builder.hotelCriteria;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isEmptyString;
import static org.hamcrest.number.OrderingComparison.greaterThan;

public class TestHotels extends WebTest<CheapTicketsHome>{

    private final HotelBuilder hotelSearch = hotelCriteria()
            .withDestination("Miami (and vicinity), Florida, United States of America")
            .withCheckIn(9)
            .withCheckOut(10)
            .withRooms(1)
            .withAdults(1)
            .withChildren(0)
            .withAirport("Buenos Aires, Argentina (EZE-Ministro Pistarini Intl.)")
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
    public void testSearchForResults() {

        HotelCard hotel = getInitialPage()
                .tabsBar()
                .toHotels()
                .search(hotelSearch)
                .getHotels()
                .get(1);

        assertThat("Hotel has a name", hotel.getName(), not(isEmptyString()));
        assertThat("Hotel has a price", hotel.getPrice(), is(greaterThan(0d)));

        hotel.select();
    }

    @Test
    public void testSearchForHotelFiveStars() {

        HotelCard hotel = getInitialPage()
                .tabsBar()
                .toHotels()
                .search(hotelSearch)
                .getHotelWithFiveStars()
                .get(1);

        assertThat("Hotel has a name", hotel.getName(), not(isEmptyString()));
        assertThat("Hotel has a price", hotel.getPrice(), is(greaterThan(0d)));

        hotel.select();
    }

    @Test
    public void testSearchWithCar(){
        HotelCard hotel = getInitialPage()
                .tabsBar()
                .toHotels()
                .searchWithCar(hotelSearch)
                .getHotels()
                .get(1);

        assertThat("Hotel has a name", hotel.getName(), not(isEmptyString()));
        assertThat("Hotel has a price", hotel.getPrice(), is(greaterThan(0d)));

        hotel.select();
    }

    @Test
    public void testSearchWithFlight(){
        HotelCard hotel = getInitialPage()
                .tabsBar()
                .toHotels()
                .searchWithFlight(hotelSearch)
                .getHotels()
                .get(1);

        assertThat("Hotel has a name", hotel.getName(), not(isEmptyString()));
        assertThat("Hotel has a price", hotel.getPrice(), is(greaterThan(0d)));

        hotel.select();
    }

    @Test
    public void testSearchWithFlightAndCar(){
        HotelCard hotel = getInitialPage()
                .tabsBar()
                .toHotels()
                .searchWithFlightAndCar(hotelSearch)
                .getHotels()
                .get(1);

        assertThat("Hotel has a name", hotel.getName(), not(isEmptyString()));
        assertThat("Hotel has a price", hotel.getPrice(), is(greaterThan(0d)));

        hotel.select();
    }


}
