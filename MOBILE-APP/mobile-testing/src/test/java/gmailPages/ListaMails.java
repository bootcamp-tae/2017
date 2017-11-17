package gmailPages;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBySet;

public class ListaMails extends MobilePage {
    @AndroidFindBySet({ @AndroidFindBy(id = "com.google.android.gm:id/recycler_list_view"),
	    @AndroidFindBy(className = "android.view.View") })

    // @AndroidFindBySet({ @AndroidFindBy(id =
    // "com.google.android.gm:id/conversation_tip_swipeable_content"),
    // @AndroidFindBy(className =
    // "com.google.android.gm:id/conversation_tip_text") })
    // private WebElement item2;

    private List<WebElement> items2;

    public List<Mail> getResultados() {

	return items2.stream().map(Mail::new).collect(toList());

    }
}
