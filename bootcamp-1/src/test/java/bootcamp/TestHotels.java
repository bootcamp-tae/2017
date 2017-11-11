package bootcamp;

import bootcamp.Elements.PageBase;
import bootcamp.Elements.WebTest;
import bootcamp.model.HotelBuilder;
import bootcamp.pages.components.HotelCard;
import bootcamp.pages.landing.CheapTicketsHome;
import org.junit.Test;

import static bootcamp.model.HotelBuilder.Builder.hotelCriteria;

public class TestHotels extends WebTest<CheapTicketsHome>{

    private final HotelBuilder hotelSearch = hotelCriteria()
            .withDestination("Havana , Cuba")
            .withCheckIn(5)
            .withCheckOut(10)
            .withRooms(1)
            .withAdults(1)
            .withChildren(0)
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

        //assertThat("Hotel has a name", hotel.getName(), not(isEmptyString()));
        //assertThat("Hotel has a price", hotel.getPrice(), is(greaterThan(0d)));

        //hotel.select();
    }
}
