package mercadolibre.pages;

import com.globant.automation.bootcamp.webdriver.web.Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends Page{

    @FindBy(css = "#root-app > div > div.ui-box.auth-box.auth-box_title--notregistered > h2")
    private WebElement text;

    public String getText(){
        return text.getText();
    }
}
