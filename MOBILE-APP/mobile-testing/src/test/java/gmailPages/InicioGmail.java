package gmailPages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class InicioGmail extends BaseGmail {

    @AndroidFindBy(id = ANDROID_PREFIX + "welcome_tour_got_it")
    private WebElement entendido;

    public ElegirCuenta empezar() {
	click(entendido);
	return new ElegirCuenta();
    }
}
