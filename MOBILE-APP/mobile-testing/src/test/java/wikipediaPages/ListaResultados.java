package wikipediaPages;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ListaResultados extends MobilePage {
    // @AndroidFindBy(className = "android.widget.FrameLayout")

    // @AndroidFindBySet({ @AndroidFindBy(id =
    // "org.wikipedia:id/fragment_search_results"),
    // @AndroidFindBy(id = "org.wikipedia:id/search_results_container") })
    @AndroidFindBy(className = "android.widget.LinearLayout")
    private List<WebElement> items;

    // org.wikipedia:id/fragment_feed_feed

    public List<Resultado> getResultados() {

	return items.stream().map(Resultado::new).collect(toList());

    }
}
