package MobileViews;

import MobileFramework.GeneralMobileOperations;
import MobileFramework.MobileView;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class YouTube extends MobileView {

    private static final String nombre_paquete = "com.google.android.youtube:id/";

    @AndroidFindBy(accessibility = "Buscar" )
    private WebElement buscar;

    @AndroidFindBy(id = nombre_paquete + "thumbnail")
    private WebElement Toyota;

    @AndroidFindBy(id = nombre_paquete + "search_type_icon")
    private WebElement lupa;


    public YouTube BuscarVideoToyota() throws InterruptedException {
        Toyota.click();
        Thread.sleep(1000);
        return this;

    }



}
