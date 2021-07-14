import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ajaxDataPage extends PageObject{


    public ajaxDataPage(WebDriver driver){
        super(driver);
    }


    @FindBy(id = "ajaxButton")
    public WebElement ajaxButton;

    @FindBy(xpath = "//*[@class ='bg-success']")
    public WebElement ajaxField;


    public void clickOnAjaxButton() {
        this.ajaxButton.click();
    }

    public String getAjaxFieldText() {
        return ajaxField.getText();

    }

}
