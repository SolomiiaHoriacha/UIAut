import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class clientSideDelayPage extends PageObject {



    public clientSideDelayPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath ="//*[@class = 'btn btn-primary']")
    public WebElement ajaxButton;

    @FindBy(xpath = "//*[@class ='bg-success']")
    public WebElement dataField;



    public void clickOnAjaxButton() {
        this.ajaxButton.click();
    }

    public String getFieldText() {
        return dataField.getText();
    }




















}
