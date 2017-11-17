package wikipediaPages;

import org.openqa.selenium.WebElement;

import com.globant.automation.bootcamp.webdriver.web.Component;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBySet;

public class Resultado extends Component {
    // android.widget.LinearLayout

    // @AndroidFindBy(className = "android.widget.ImageView")

    @AndroidFindBySet({ @AndroidFindBy(id = "org.wikipedia:id/search_results_container"),
	    @AndroidFindBy(className = "android.widget.LinearLayout") })

    private WebElement item;

    public Resultado(WebElement rootElement) {
	super(rootElement);
    }

    public void select() {
	click(item);

    }

}
