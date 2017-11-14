package com.globant.automation.bootcamp.ui.pageObjects.cheaptickets;

import com.globant.automation.bootcamp.ui.cheaptickets.models.HotelCriteria;
import com.globant.automation.bootcamp.ui.cheaptickets.pages.hotels.HotelCard;
import com.globant.automation.bootcamp.ui.cheaptickets.pages.landing.Home;
import com.globant.automation.bootcamp.webdriver.WebTest;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static com.globant.automation.bootcamp.ui.cheaptickets.models.HotelCriteria.Builder.aHotelCriteria;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class CheapTicketsTest extends WebTest<Home> {

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
        .tabsBar()
        .toHotels()
        .search(hotelCriteria)
        .getHotels()
        .get(5);

    assertThat("Hotel has a name", hotel.getName(), not(isEmptyString()));
    assertThat("Hotel has a price", hotel.getPrice(), is(greaterThan(0d)));

    hotel.select();
  }

  @Override
  protected Home getInitialPage() {
    return new Home();
  }

  @Override
  protected String getInitialUrl() {
    return "https://www.cheaptickets.com/";
  }
}
