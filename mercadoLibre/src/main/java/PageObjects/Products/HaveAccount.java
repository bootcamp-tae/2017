package PageObjects.Products;

import PageObjects.MercadoLibrePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HaveAccount extends MercadoLibrePage {

    @FindBy (id = "registration-link")
    private WebElement createAccount;

    public String getSoyNuevo() {
        return getText(createAccount);
    }
}
