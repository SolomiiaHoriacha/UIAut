import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class progressBarPage extends PageObject{

    public progressBarPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id="startButton")
    public WebElement startButton;

    @FindBy(id="progressBar")
    public WebElement progress;

    @FindBy(id="stopButton")
    public WebElement stopButton;

    @FindBy(id="result")
    public WebElement result;



    public void pressStartButton() {
        this.startButton.click();
    }
    public void pressStopButton() {
        this.stopButton.click();
    }
    public String getResult(){
        return result.getText();
    }








































}
