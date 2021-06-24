import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class clickPage extends PageObject{




    public  clickPage(WebDriver driver){
        super(driver);

    }
    @FindBy(xpath ="//*[@class = 'btn btn-primary']")
    public WebElement badButton;

    public  void  clickOnBadButton() {
        this.badButton.click();
    }

}
