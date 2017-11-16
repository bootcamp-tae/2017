package pageObjects;

import framework.mobile.MobilePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBySet;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YoutubePage extends MobilePage {

    @AndroidFindBySet({
            @AndroidFindBy(id = "com.google.android.youtube:id/toolbar"),
            @AndroidFindBy(className = "aro"),
            @AndroidFindBy(xpath = "//android.widget.ImageView[2]")
    })
    private WebElement searchButton;

    public SearchListBox search(){
            click(searchButton);
        return new SearchListBox();
    }
}
