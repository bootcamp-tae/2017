package bootcamp;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class CalculatorHome extends CalculatorPage{

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_0")
    private MobileElement ceroNumberElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_1")
    private MobileElement oneNumberElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_2")
    private MobileElement twoNumberElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_3")
    private MobileElement threeNumberElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_4")
    private MobileElement fourNumberElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_5")
    private MobileElement fiveNumberElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_6")
    private MobileElement sixNumberElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_7")
    private MobileElement sevenNumberElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_8")
    private MobileElement eightNumberElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_9")
    private MobileElement nineNumberElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "dec_point")
    private MobileElement decPointElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "eq")
    private MobileElement equalElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "del")
    private MobileElement deleteElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "op_div")
    private MobileElement divideElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "op_mul")
    private MobileElement multiplyElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "op_sub")
    private MobileElement subElement;

    @AndroidFindBy(id = ANDROID_PREFIX +"op_add")
    private MobileElement addElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "formula")
    private MobileElement formulaElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "result")
    private MobileElement resultElement;

    @AndroidFindBy(id = ANDROID_PREFIX + "pad_advanced")
    private MobileElement padAdvanced;

    public CalculatorHome (){
        waitFor(visibilityOfAllElements(Arrays.asList(resultElement,addElement,subElement,multiplyElement
        ,deleteElement,equalElement,decPointElement,nineNumberElement,eightNumberElement,sevenNumberElement,sixNumberElement
        ,fiveNumberElement,fourNumberElement,threeNumberElement,twoNumberElement,oneNumberElement,ceroNumberElement,padAdvanced)));
    }

    public CalculatorHome cero(){
        click(ceroNumberElement);
        return this;
    }
    public CalculatorHome one(){
        click(oneNumberElement);
        return this;
    }
    public CalculatorHome two(){
        click(twoNumberElement);
        return this;
    }
    public CalculatorHome three(){
        click(threeNumberElement);
        return this;
    }
    public CalculatorHome four(){
        click(fourNumberElement);
        return this;
    }
    public CalculatorHome five(){
        click(fiveNumberElement);
        return this;
    }
    public CalculatorHome six(){
        click(sixNumberElement);
        return this;
    }
    public CalculatorHome seven(){
        click(sevenNumberElement);
        return this;
    }
    public CalculatorHome eight(){
        click(eightNumberElement);
        return this;
    }
    public CalculatorHome nine(){
        click(nineNumberElement);
        return this;
    }
    public CalculatorHome add(){
        click(addElement);
        return this;
    }
    public CalculatorHome sub(){
        click(subElement);
        return this;
    }
    public CalculatorHome multiply(){
        click(multiplyElement);
        return this;
    }
    public CalculatorHome div(){
        click(divideElement);
        return this;
    }
    public CalculatorHome del(){
        click(deleteElement);
        return this;
    }
    public CalculatorHome decPoint(){
        click(decPointElement);
        return this;
    }
    public CalculatorHome eq(){
        click(equalElement);
        return this;
    }
    public String getFormula(){
        return getText(formulaElement);
    }
    public String getResult(){
        return getText(resultElement);
    }
}
