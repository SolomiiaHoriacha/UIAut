import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {


    @FindBy(xpath = "//*[@href='/dynamicid']")
    public WebElement LinkDynamicID;

    @FindBy(xpath = "//*[@href = '/classattr']")
    public WebElement LinkClassAttribute;

    @FindBy(xpath = "//*[@href = '/click']")
    public WebElement LinkClick;

    @FindBy(xpath = "//*[@href = '/hiddenlayers']")
    public WebElement LinkHiddenLayers;




    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickLinkDynamicID() {
        this.LinkDynamicID.click();

    }
    public void openClassAttributePage() {
        this.LinkClassAttribute.click();
    }
    public void openClickPage(){
        this.LinkClick.click();
    }
    public void openHiddenLayersPage(){
        this.LinkHiddenLayers.click();

    }
}

