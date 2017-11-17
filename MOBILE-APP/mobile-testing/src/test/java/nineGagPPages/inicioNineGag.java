package nineGagPPages;

import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class inicioNineGag extends nineGagBase {
    @AndroidFindBy(xpath = ANDROID_PREFIX + "ActionBar.b[2]/android.widget.TextView")
    private WebElement tabTrending;

    @AndroidFindBy(xpath = ANDROID_PREFIX + "ActionBar.b[1]")
    private WebElement tabHot;

    @AndroidFindBy(id = "com.ninegag.android.app:id/action_home_tab")
    private WebElement home;

    public inicioNineGag irATrending() {
	click(tabTrending);
	return this;
    }

    public inicioNineGag irAHot() {
	click(tabHot);

	return this;
    }

    public inicioNineGag irAHome() {
	click(home);

	return this;
    }

    public void scroll() {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();
	HashMap<String, String> scrollObject = new HashMap<String, String>();
	scrollObject.put("direction", "down");
	js.executeScript("mobile: scroll", scrollObject);

    }

}
