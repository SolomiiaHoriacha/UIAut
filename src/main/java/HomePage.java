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

    @FindBy(xpath ="//*[@href = '/clientdelay']")
    public WebElement LinkClientSideDelay;

    @FindBy(xpath = "//*[@href='/sampleapp']")
    public WebElement LinkSampleApp;

   @FindBy(xpath = "//*[@href='/dynamictable']")
   public WebElement LinkDynamicTable;

   @FindBy(xpath = "//*[@href='/ajax']")
   public WebElement LinkAjaxData;

   @FindBy(xpath = "//*[@href='/textinput']")
   public  WebElement LinkTextInput;

   @FindBy(xpath = "//*[@href='/verifytext']")
   public WebElement LinkVerifyText;

   @FindBy(xpath = "//*[@href='/progressbar']")
   public WebElement LinkProgressBar;

   @FindBy(xpath = "//*[@href= '/mouseover']" )
   public WebElement LinkMouseOver;

   @FindBy(xpath = "//*[@href= '/nbsp']")
   public WebElement LinkNonBreakingSpace;

   @FindBy(xpath = "//*[@href= '/scrollbars']")
   public WebElement LinkScrollbars;




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
    public void openClientSideDelayPage(){
        this.LinkClientSideDelay.click();
    }
    public void openSampleAppPage(){
        this.LinkSampleApp.click();
    }
    public void openDynamicTablePage(){
        this.LinkDynamicTable.click();
    }
    public void openAjaxDataPage(){
        this.LinkAjaxData.click();
    }
    public void openTextInputPage(){
        this.LinkTextInput.click();
    }
    public void openVerifyTextPage(){
        this.LinkVerifyText.click();
    }
    public void openProgressBarPage(){
        this.LinkProgressBar.click();
    }
    public void openMouseOverPage(){
        this.LinkMouseOver.click();
    }
    public void openNonBreakingSpacePage(){
        this.LinkNonBreakingSpace.click();
    }
    public void openScrollbars(){
        this.LinkScrollbars.click();
    }

}

