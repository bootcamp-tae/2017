package pages;

import framework.mobile.MobilePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class YoutubePage extends MobilePage {

    @AndroidFindBy(id = "Buscar")
    private WebElement searchButton;

    public SearchListBox search() {
            click(searchButton);
        return new SearchListBox();
    }
}
