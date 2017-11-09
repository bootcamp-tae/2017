import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class CheapTicketHotelsSuitTest {

        private static CheapTicketHome home;
        private static HotelView hotelView;

        @BeforeClass
        public static void setUp(){
                System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
                home = new CheapTicketHome();
                hotelView = home.SelectHotels();
        }

        /*
        Escribir en un campo Date:
                ((JavascriptExecutor) getDriver()).executeScript ( "arguments[0].value = arguments[1];", element, date )

        Clas
         */

        @Test
        public void testGoingTo () {
                String destination = "Mar del Plata";

                hotelView.getDestinationSearchBox()
                        .sendKeys(destination);
                Assert.assertEquals(destination, home.SelectHotels()
                                                        .getDestinationSearchBox()
                                                        .getAttribute("value"));
        }

        @Test
        public void testDates(){
                String dateIn = "03/07/2017";
                String dateOut =  "09/07/2017";
                home.enterDate(hotelView.getCheckinBox(),dateIn);
                Assert.assertEquals(dateIn, hotelView
                        .getCheckinBox()
                        .getAttribute("value"));

                home.enterDate(hotelView.getCheckoutBox(),dateOut);
                Assert.assertEquals(dateOut, hotelView
                        .getCheckoutBox()
                        .getAttribute("value"));
        }

        @Test
        public void testSelects(){

                Integer rooms = 4;
                Integer adults = 2;
                Integer childrens = 3;

                hotelView.selectRooms(rooms.toString());
                Assert.assertThat(hotelView.getRoomSelector().getAttribute("value"), is(rooms.toString()));
        }


}
