import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class nonBreakingSpacePage extends PageObject{


    public nonBreakingSpacePage(WebDriver driver){
        super(driver);
    }


    @FindBy(xpath = "//button[text()='My\u00A0Button']")
    public WebElement myButton;

    public void clickMyButton(){
        this.myButton.click();
    }





}
