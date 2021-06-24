import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class classAttributePage extends PageObject{


    public classAttributePage(WebDriver driver){
        super(driver);
    }
    @FindBy(xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")
    public WebElement primaryButton;

    public  void  clickOnPrimaryButton(){
        this.primaryButton.click();
        
    }
    public void clickAlertOKButton(){
        driver.switchTo().alert().accept();
    }



}
