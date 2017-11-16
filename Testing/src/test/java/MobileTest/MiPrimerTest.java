package MobileTest;
import MobileFramework.AndroidViewsTest;
import MobileViews.YouTube;
import org.junit.Test;

public class MiPrimerTest  extends AndroidViewsTest<YouTube>{

    @Test
    public void Test() throws InterruptedException {
    YouTube prueba = new YouTube().BuscarVideoToyota();
    }





}
