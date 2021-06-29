import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sampleAppPage extends PageObject{


    public sampleAppPage(WebDriver driver){
        super(driver);
    }

    private final String UserName = "User name";
    private final String Password = "pwd";


    @FindBy(name = "UserName")
    private WebElement userNameField;

    @FindBy(name = "Password")
    private WebElement passwordField;

    @FindBy(id = "login")
    private WebElement login_button;

    @FindBy(id ="loginstatus")
    private WebElement loginStatus;


    public void enterUserName(){
        this.userNameField.sendKeys(UserName);
    }
    public void enterPassword(){
       this.passwordField.sendKeys(Password);
    }
    public void pressLoginButton(){
        this.login_button.click();
    }

    public String getLoginStatus() {
        return loginStatus.getText();
    }





























}
