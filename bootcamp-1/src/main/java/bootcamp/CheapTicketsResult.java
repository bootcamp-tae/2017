package bootcamp;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheapTicketsResult extends PageBase{

    @FindBy(id="resultsContainer")
    private WebElement resultsContainer;

    public CheapTicketsResult(WebDriver driver){
        super(driver);
    }

    public boolean resultados(){
        try{
          if(resultsContainer!=null){
              return true;
          }
          else{
              return false;
          }
        }
        catch (Exception e){
            e.getStackTrace();
            return false;
        }
    }

    public CheapTicketsResult doSomething(){
        return new CheapTicketsResult(getDriver());
    }
}
