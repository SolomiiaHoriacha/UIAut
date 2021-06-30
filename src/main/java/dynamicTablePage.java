import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dynamicTablePage extends PageObject{

    public dynamicTablePage(WebDriver driver){
        super(driver);
    }


    @FindBy(className = "bg-warning")
    private WebElement warningCPUMessage;

    @FindBy(xpath = "//span[text()='Chrome']/following-sibling::span[contains(text(), '%')]")
    private WebElement taskManagerCPUValue;


    public String getWarningCPUMessage() {
        dynamicTablePage dynamicTablePage = new dynamicTablePage(driver);
        String messageCPU = dynamicTablePage.warningCPUMessage.getText();
        return messageCPU.split(" ")[2];

    }
    public String getCPUFromTaskManagerTable() {
        dynamicTablePage dynamicTablePage = new dynamicTablePage(driver);
        return dynamicTablePage.taskManagerCPUValue.getText();
    }














}
