import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dynamicIDPage extends PageObject {



    @FindBy(xpath = "//*[@class ='btn btn-primary']")
    public WebElement buttonWithDynamicID;

    public dynamicIDPage(WebDriver driver){
        super(driver);

    }
    public void clickWithDynamicID(){
        this.buttonWithDynamicID.click();
    }




}
