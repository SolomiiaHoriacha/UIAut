import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class hiddenLayersPage extends PageObject{

        public hiddenLayersPage(WebDriver driver){
            super(driver);
        }


        @FindBy(xpath = "//*[@class='btn btn-primary']")
        public WebElement blueButton;


    public void doubleClickGreenButton() {
        Actions action = new Actions(driver);
        action.doubleClick();
    }

}
