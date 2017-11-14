package PageObjects.Products;

import PageObjects.MercadoLibreComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FiltersComponent extends MercadoLibreComponent{

    @FindBy(css = "#id_condition a")
    private List<WebElement> conditions;

    public FiltersComponent(WebElement webElement) {
        super(webElement);
    }

    public SearchResultsPage byCondition(Conditions condition) {

        click(conditions.get(condition.ordinal()));

        /*
        switch (condition){
            case NEW:
                click(conditions.get(condition.ordinal()));
                break;
            case USED:
                click(conditions.get(condition.ordinal()));
                break;
        }*/
        return new SearchResultsPage();
    }

    public enum Conditions {
        NEW, USED
    }
}
