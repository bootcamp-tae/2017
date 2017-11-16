import framework.WebDriver.Page;
import framework.WebDriver.WebTest;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class CheapTicketHotelsSuitTest extends WebTest{

        private static CheapTicketHome home;

        @Override
        protected Page getInitialPage() {
                return null;
        }

        @Override
        protected String getInitialURL() {
                return null;
        }

        @BeforeClass
        public static void init(){
                //TODO usar RemoteWebDriver y borrar esta linea.
                System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
                home = new CheapTicketHome();
        }

        @Test
        public void doOneSearch(){

                HotelsTabPanel hotelsTabPanel = home.getTabBar().clickHotels();
                HotelCriteria hotelSearchData = HotelCriteria.Builder.anHotelCriteria()
                        .withDestination("Mar del Plata")
                        .withRooms(3)
                        .withAdults(2)
                        .withChildren(3)
                        .withCheckIn(7)
                        .withCheckOut(20)
                        .build();


                hotelsTabPanel.getDestinationSearchBox()
                        .sendKeys(hotelSearchData.getDestination());

                home.enterDate(hotelsTabPanel.getCheckinBox(),hotelSearchData.getCheckIn());

                home.enterDate(hotelsTabPanel.getCheckoutBox(),hotelSearchData.getCheckOut());

                hotelsTabPanel.selectRooms(hotelSearchData.getRooms());
                Assert.assertThat(hotelsTabPanel.getRoomSelector().getAttribute("value"), is(hotelSearchData.getRooms()));
                if(hotelSearchData.getRooms() < 9){
                        for (int i = 1; i <= hotelSearchData.getRooms(); i++) {
                                hotelsTabPanel.pickKidsOnRoom(hotelSearchData.getKids(), i)
                                        .pickAdultsOnRoom(hotelSearchData.getAdults(), i);
                        }

                }
        }
        /*
        Escribir en un campo Date:
                ((JavascriptExecutor) getDriver()).executeScript ( "arguments[0].value = arguments[1];", element, date )

        Clas
         */



}
