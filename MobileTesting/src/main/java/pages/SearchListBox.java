package pages;

import framework.mobile.MobilePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class SearchListBox extends MobilePage {

    @AndroidFindBy(id = "com.google.android.youtube:id/search_edit_text")
    private WebElement searchBox;

    private List<WebElement> options;

    public SearchListBox write(String something) {
        type(something, searchBox);

        options = getDriver().findElements(By.id("com.google.android.youtube:id/search_type_icon"));


        searchBox.getAttribute("instance");
        return this;
    }

    public VideoListPage pickOption(int i) {


        for(WebElement option : options){
            if(option.getAttribute("instance") == String.valueOf(i)){
                click(option);
            }
        }

        return new VideoListPage();
    }
}
