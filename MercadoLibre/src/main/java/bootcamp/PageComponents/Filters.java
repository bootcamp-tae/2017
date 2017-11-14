package bootcamp.PageComponents;

import bootcamp.Elements.WebComponent;
import bootcamp.landing.MercadoLibreResults;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Filters extends WebComponent{

    @FindBy(css = "#id_state a")
    private List<WebElement> locations;

    @FindBy(css = "#id_condition a")
    private List<WebElement> conditions;

    public Filters(WebElement container) {
        super(container);
    }

    public MercadoLibreResults byLocation(String location) {
        locations.stream().filter(e->e.getText().contains(location)).findFirst().ifPresent(WebElement::click);
        return new MercadoLibreResults();
    }

    public MercadoLibreResults byCondition(Condition condition) {
        switch (condition){
            case NEW:
                click(conditions.get(condition.ordinal()));
                break;
            case USED:
                break;
        }
        return new MercadoLibreResults();
    }

    public enum Condition {
        NEW, USED
    }
}
