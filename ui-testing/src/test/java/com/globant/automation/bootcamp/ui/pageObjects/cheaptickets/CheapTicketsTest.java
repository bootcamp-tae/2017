package com.globant.automation.bootcamp.ui.pageObjects.cheaptickets;

import com.globant.automation.bootcamp.ui.cheaptickets.models.HotelCriteria;
import com.globant.automation.bootcamp.ui.cheaptickets.pages.hotels.HotelCard;
import com.globant.automation.bootcamp.ui.cheaptickets.pages.landing.DontWannaSaveExtra;
import com.globant.automation.bootcamp.ui.cheaptickets.pages.landing.WizardContainer;
import com.globant.automation.bootcamp.webdriver.WebTest;
import org.junit.Test;

import static com.globant.automation.bootcamp.ui.cheaptickets.models.HotelCriteria.Builder.aHotelCriteria;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class CheapTicketsTest extends WebTest<WizardContainer> {

    private final HotelCriteria hotelCriteria = aHotelCriteria()
            .withDestination("Mar del Plata")
            .withCheckIn(5)
            .withCheckOut(10)
            .withRooms(1)
            .withAdults(1)
            .withChildren(0)
            .build();

    @Test
    public void sample() {

        HotelCard hotel = getInitialPage()
                .closeAdvice()
                .tabsBar()
                .toHotels()
                .search(hotelCriteria)
                .getHotels()
                .get(5);

        assertThat("Hotel has a name", hotel.getName(), not(isEmptyString()));
        assertThat("Hotel has a price", hotel.getPrice(), is(greaterThan(0d)));

        hotel.select();
    }

    //Dont understand why this isnt working, "getInitialPage" its declared with generic
    @Override
    protected DontWannaSaveExtra getInitialPage() {
        return new DontWannaSaveExtra();
    }

    @Override
    protected String getInitialUrl() {
        return "https://www.cheaptickets.com/";
    }
}
