package gmailPages;

import org.openqa.selenium.WebElement;

import com.globant.automation.bootcamp.webdriver.web.Component;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Mail extends Component {
    // com.google.android.gm:id/recycler_list_view

    @AndroidFindBy(className = "android.view.View")
    private WebElement item;

    public Mail(WebElement rootElement) {
	super(rootElement);
    }

    public void select() {
	click(item);

    }

}
