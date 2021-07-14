import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class verifyTextPage extends PageObject{

    public verifyTextPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//span[normalize-space(.)='Welcome UserName!']")
    private WebElement textString;



    public String getFieldName() {
        return textString.getText();
    }





























}
