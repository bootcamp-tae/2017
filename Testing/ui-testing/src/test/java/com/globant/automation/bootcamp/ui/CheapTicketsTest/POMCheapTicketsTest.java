package com.globant.automation.bootcamp.ui.CheapTicketsTest;

import com.globant.automation.bootcamp.ui.pages.CheapTicketsHome;
import com.globant.automation.bootcamp.ui.models.HotelSearch;
import com.globant.automation.bootcamp.ui.pages.hotels.HotelDetail;
import com.globant.automation.bootcamp.webdriver.junit.ParametrizedParallelism;
import com.globant.automation.bootcamp.webdriver.webdriver.WebTest;
import org.junit.Test;
import org.junit.runner.RunWith;


import static com.globant.automation.bootcamp.ui.models.HotelSearch.Builder.aHotelSearch;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@RunWith(ParametrizedParallelism.class)
public class POMCheapTicketsTest extends WebTest<CheapTicketsHome>{


    private final HotelSearch hotelSearch = aHotelSearch()
            .withDestination("New York")
            .withCheckIn(5)
            .withCheckOut(20)
            .withRooms(1)
            .withAdults(2)
            .withChildren(0)
            .build();

    @Test
    public void testSample() {
        HotelDetail hotel = getInitialPage()
                .getTabsBar()
                .toHotels()
                .searchHotels(hotelSearch)
                .selectResult(0);

        assertThat("Bad hotel", hotel.getHotelRating(), is(lessThan(2.0d)));
        assertThat("Hotel has a name", hotel.getName(), not(isEmptyString()));
        assertThat("Hotel has a price", hotel.getPricePerNight(), is(greaterThan(0d)));

    }

    @Override
    protected CheapTicketsHome getInitialPage() {
        return new CheapTicketsHome();
    }

    @Override
    protected String getInitialUrl() {
        return "https://www.cheaptickets.com/";
    }

}
