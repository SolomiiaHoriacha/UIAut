import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class textInputPage extends PageObject{

    public textInputPage(WebDriver driver) {
        super(driver);
    }

    private final String ButtonName = "New Button Name";


    @FindBy(id="newButtonName")
    private WebElement nameField;

    @FindBy(xpath = "//*[@class ='btn btn-primary']")
    private  WebElement oldButton;

    @FindBy(id="updatingButton")
    private WebElement newButton;



    public void enterNewButtonName() {
      this.nameField.sendKeys(ButtonName);
    }
    public void pressNewButton(){
        this.oldButton.click();
    }
    public String getNewButtonName() {
        return newButton.getText();
    }
}
