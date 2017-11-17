package calculadoraPages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class calculadoraActividad extends calculadoraBase {

    @AndroidFindBy(id = ID_BASE + "digit_5")
    private WebElement cinco;

    @AndroidFindBy(id = ID_BASE + "digit_3")
    private WebElement three;

    @AndroidFindBy(id = ID_BASE + "eq")
    private WebElement equal;

    @AndroidFindBy(id = ID_BASE + "op_mul")
    private WebElement mult;

    @AndroidFindBy(id = ID_BASE + "op_add")
    private WebElement sum;

    @AndroidFindBy(id = ID_BASE + "op_sub")
    private WebElement rest;

    @AndroidFindBy(id = ID_BASE + "op_div")
    private WebElement div;

    @AndroidFindBy(id = ID_BASE + "result")
    private WebElement result;

    public calculadoraActividad cinco() {
	click(cinco);
	return this;
    }

    public calculadoraActividad multiplicar() {
	click(mult);
	return this;
    }

    public calculadoraActividad dividir() {
	click(div);
	return this;
    }

    public calculadoraActividad sumar() {
	click(sum);
	return this;
    }

    public calculadoraActividad restar() {
	click(rest);
	return this;
    }

    public calculadoraActividad elResultadoEs() {
	click(equal);
	return new calculadoraActividad();
    }

    public calculadoraActividad tres() {
	click(three);
	return this;
    }

}
