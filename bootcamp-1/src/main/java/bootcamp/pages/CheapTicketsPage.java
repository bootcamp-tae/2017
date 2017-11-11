package bootcamp.pages;

import bootcamp.Elements.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CheapTicketsPage extends Page {

    protected void enterDate(WebElement element, String date) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].value = arguments[1];", element, date);
    }
}
