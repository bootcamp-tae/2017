package gmailPages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ElegirCuenta extends BaseGmail {
    // com.google.android.gm:id/
    @AndroidFindBy(id = ANDROID_PREFIX + "action_done")
    private WebElement cuenta;

    // public ElegirCuenta clickIrAGmail() {
    // click(cuenta);
    // return this;
    // }

    public ListaMails clickIrAGmail() {
	click(cuenta);
	return new ListaMails();
    }
}
