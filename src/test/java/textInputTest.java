import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class textInputTest {

    private static final WebDriver driver = new ChromeDriver();


    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
    @Test
    public void textInputTest() {
        HomePage homePage = new HomePage(driver);
        textInputPage textInputPage = new textInputPage(driver);
        driver.get(Utils.BASE_URL);
        homePage.openTextInputPage();
        textInputPage.enterNewButtonName();
        textInputPage.pressNewButton();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals(textInputPage.getNewButtonName(),"New Button Name");

    }
}
