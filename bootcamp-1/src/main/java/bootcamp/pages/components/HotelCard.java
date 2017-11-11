package bootcamp.pages.components;

import bootcamp.Elements.WebComponent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelCard extends WebComponent {

    @FindBy(id="resultsContainer")
    private WebElement resultsContainer;

    @FindBy(css = ".flex-link")
    private WebElement link;

    @FindBy(css = "[data-automation=\"hotel-name\"]")
    private WebElement name;

    @FindBy(css = "[data-automation='actual-price']")
    private WebElement price;

    private static final Pattern PATTERN = Pattern.compile("\\d+(([.,])\\d+?)?");


    public HotelCard(WebElement container) {
        super(container);
    }


    public String getName() {
        return getText(name);
    }

    public double getPrice() {
        String p = getText(price);
        Matcher m = PATTERN.matcher(p);
        if (m.find()) {
            return Double.parseDouble(m.group(0));
        }
        return 0;
    }

    public HotelDetails select() {
        click(link);
        return new HotelDetails();
    }



}
