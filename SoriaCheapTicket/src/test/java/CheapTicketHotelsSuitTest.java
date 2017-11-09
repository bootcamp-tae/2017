import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.core.Is.is;

public class CheapTicketHotelsSuitTest {

        private static CheapTicketHome home;
        private static HotelView hotelView;

        @BeforeClass
        public static void setUp(){
                System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
                home = new CheapTicketHome(new FirefoxDriver());
                hotelView = home.SelectHotels();
        }

        /*
        Escribir en un campo Date:
                ((JavascriptExecutor) getDriver()).executeScript ( "arguments[0].value = arguments[1];", element, date )

        Clas
         */

        @Test
        public void testGoingTo () {

                hotelView.getDestinationSearchBox()
                        .sendKeys(HotelSearchData.getLocation());
                Assert.assertEquals(HotelSearchData.getLocation(), home.SelectHotels()
                                                        .getDestinationSearchBox()
                                                        .getAttribute("value"));
        }

        @Test
        public void testDates(){
                home.enterDate(hotelView.getCheckinBox(),HotelSearchData.getCheckin());
                Assert.assertEquals(HotelSearchData.getCheckin(), hotelView
                        .getCheckinBox()
                        .getAttribute("value"));

                home.enterDate(hotelView.getCheckoutBox(),HotelSearchData.getCheckout());
                Assert.assertEquals(HotelSearchData.getCheckout(), hotelView
                        .getCheckoutBox()
                        .getAttribute("value"));
        }

        @Test
        public void testSelects(){

                hotelView.selectRooms(HotelSearchData.getRooms());
                Assert.assertThat(hotelView.getRoomSelector().getAttribute("value"), is(HotelSearchData.getRooms()));

                if(HotelSearchData.getRooms() < 9){
                     for (int i = 1; i <= HotelSearchData.getRooms(); i++) {
                             hotelView.pickKidsOnRoom(HotelSearchData.getKids(), i)
                                      .pickAdultsOnRoom(HotelSearchData.getAdults(), i);
                     }

                }

        }


}
