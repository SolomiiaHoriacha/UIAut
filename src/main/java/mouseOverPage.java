import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class mouseOverPage extends PageObject {


    public mouseOverPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@class='text-primary']")
    public WebElement clickButton;


    @FindBy(id="clickCount")
    public WebElement count;


    public void doubleClickButton() {
        Actions action = new Actions(driver);
        action.doubleClick(clickButton);
        action.perform();
    }

    public String getCount() {
        return count.getText();
    }






}























