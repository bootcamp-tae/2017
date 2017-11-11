package bootcamp.pages.landing;

import bootcamp.model.HotelBuilder;
import bootcamp.pages.CheapTicketsPage;
import bootcamp.pages.components.Hotels.HotelResults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hotels extends CheapTicketsPage{

    @FindBy(id = "hotel-destination")
    private WebElement searchInput;

    @FindBy(id="hotel-checkin")
    private WebElement dateInputFirst;

    @FindBy(id="hotel-checkout")
    private WebElement dateInputLast;

    @FindBy(id="search-button")
    private WebElement searchButton;

    @FindBy(id="hotel-rooms")
    private WebElement hotelRooms;

    @FindBy(id="hotel-1-adults")
    private WebElement hotelAdults;

    @FindBy(id="hotel-1-children")
    private WebElement hotelChildrens;

    @FindBy(id="hotel-add-flight-checkbox")
    private WebElement checkFlight;

    @FindBy(id="hotel-add-car-checkbox")
    private WebElement checkCar;

    @FindBy(id="hotel-flight-origin")
    private WebElement flightOrigin;

    public HotelResults search(HotelBuilder builder) {
        type(searchInput, builder.getDestination());
        enterDate(dateInputFirst, builder.getCheckIn());
        enterDate(dateInputLast, builder.getCheckOut());
        selectByText(hotelRooms, String.valueOf(builder.getRooms()));
        selectByText(hotelAdults, String.valueOf(builder.getAdults()));
        selectByText(hotelChildrens, String.valueOf(builder.getChildren()));
        click(searchButton);
        return new HotelResults();
    }

    public HotelResults searchWithCar(HotelBuilder builder){
        type(searchInput, builder.getDestination());
        enterDate(dateInputFirst, builder.getCheckIn());
        enterDate(dateInputLast, builder.getCheckOut());
        selectByText(hotelRooms, String.valueOf(builder.getRooms()));
        selectByText(hotelAdults, String.valueOf(builder.getAdults()));
        selectByText(hotelChildrens, String.valueOf(builder.getChildren()));
        click(checkCar);
        click(searchButton);
        return new HotelResults();
    }

    public HotelResults searchWithFlight(HotelBuilder builder){
        type(searchInput, builder.getDestination());
        enterDate(dateInputFirst, builder.getCheckIn());
        enterDate(dateInputLast, builder.getCheckOut());
        selectByText(hotelRooms, String.valueOf(builder.getRooms()));
        selectByText(hotelAdults, String.valueOf(builder.getAdults()));
        selectByText(hotelChildrens, String.valueOf(builder.getChildren()));
        click(checkFlight);
        selectByText(flightOrigin,String.valueOf(builder.getAirport()));
        click(searchButton);
        return new HotelResults();
    }

    public HotelResults searchWithFlightAndCar(HotelBuilder builder){
        type(searchInput, builder.getDestination());
        enterDate(dateInputFirst, builder.getCheckIn());
        enterDate(dateInputLast, builder.getCheckOut());
        selectByText(hotelRooms, String.valueOf(builder.getRooms()));
        selectByText(hotelAdults, String.valueOf(builder.getAdults()));
        selectByText(hotelChildrens, String.valueOf(builder.getChildren()));
        click(checkCar);
        click(checkFlight);
        type(flightOrigin,builder.getAirport());
        click(searchButton);
        return new HotelResults();
    }

}
