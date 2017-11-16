package pages;

import com.globant.automation.bootcamp.webdriver.mobile.MobilePage;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Arrays;

import static java.util.Arrays.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class CalculatorPage extends MobilePage {

    private static final String ANDROID_PREFIX = "com.android.calculator2:id/";

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_2")
    private WebElement two;

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_3")
    private WebElement three;

    @AndroidFindBy(id = ANDROID_PREFIX + "eq")
    private WebElement equals;

    @AndroidFindBy(id = ANDROID_PREFIX + "op_add")
    private WebElement add;

    @AndroidFindBy(id = ANDROID_PREFIX + "formula")
    private WebElement result;

    public CalculatorPage() { waitFor(visibilityOfAllElements(asList(two,three,equals,add, result)));}

    public CalculatorPage two() {
        click(two);
        return this;
    }

    public CalculatorPage three(){
        click(three);
        return this;
    }

    public CalculatorPage plus(){
        click(add);
        return this;
    }

    public String getResult(){
        return getText(result);
    }

}
