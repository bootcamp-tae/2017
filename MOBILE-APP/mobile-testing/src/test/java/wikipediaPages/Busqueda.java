package wikipediaPages;

import org.openqa.selenium.WebElement;

import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Busqueda extends MobilePage {
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.TextView")
    private WebElement barra;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]")
    private WebElement elemento;

    // android.widget.LinearLayout org.wikipedia:id/view_list_card_header

    @AndroidFindBy(id = "org.wikipedia:id/fragment_feed_header")
    private WebElement idioma;

    public Busqueda clickbuscar() {
	click(barra);
	return this;
    }

    public Busqueda buscar() {
	barra.sendKeys("parque");
	return this;
    }

    public Busqueda clickElemento() {
	click(elemento);
	return this;
    }

    public Busqueda primerElementoBusqueda() {
	click(idioma);
	return this;
    }
}
