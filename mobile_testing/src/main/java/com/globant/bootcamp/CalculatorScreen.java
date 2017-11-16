package com.globant.bootcamp;

import com.globant.automation.bootcamp.webdriver.mobile.Screen;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.Arrays;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

/**
 * Created by Facundo on 15/11/2017.
 */
public class CalculatorScreen extends Screen{

    private static final String ANDROID_PREFIX = "com.android.calculator2:id/";

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_2")
    private MobileElement btnTwo;

    @AndroidFindBy(id = ANDROID_PREFIX + "digit_6")
    private MobileElement btnSix;

    @AndroidFindBy(id = ANDROID_PREFIX +"op_add")
    private MobileElement btnAdd;

    @AndroidFindBy(id = ANDROID_PREFIX + "op_sub")
    private MobileElement btnSub;

    @AndroidFindBy(id = ANDROID_PREFIX + "op_mul")
    private MobileElement btnMultiply;

    @AndroidFindBy(id = ANDROID_PREFIX + "op_div")
    private MobileElement btnDivide;

    @AndroidFindBy(id = ANDROID_PREFIX + "eq")
    private MobileElement btnEquals;

    @AndroidFindBy(id = ANDROID_PREFIX + "formula")
    private MobileElement result;

    public CalculatorScreen() {
        waitFor(visibilityOfAllElements(Arrays.asList(btnTwo, btnSix, btnAdd, btnSub, btnMultiply, btnDivide, btnEquals)));
    }

    public String result() {
        return result.getText();
    }

    public CalculatorScreen two() {
        click(btnTwo);
        return this;
    }

    public CalculatorScreen six() {
        click(btnSix);
        return this;
    }

    public CalculatorScreen plus() {
        click(btnAdd);
        return this;
    }

    public CalculatorScreen minus() {
        click(btnSub);
        return this;
    }

    public CalculatorScreen multiply() {
        click(btnMultiply);
        return this;
    }

    public CalculatorScreen divide() {
        click(btnDivide);
        return this;
    }

    public CalculatorScreen isEquals() {
        click(btnEquals);
        return this;
    }

}
