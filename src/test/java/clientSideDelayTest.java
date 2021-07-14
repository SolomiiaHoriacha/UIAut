import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class clientSideDelayTest {


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
    public void clientSideDelayTest() {
        HomePage homePage = new HomePage(driver);
        clientSideDelayPage clientSideDelayPage = new clientSideDelayPage(driver);
        driver.get(Utils.BASE_URL);
        homePage.openClientSideDelayPage();
        clientSideDelayPage.clickOnAjaxButton();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        Assert.assertEquals(clientSideDelayPage.getFieldText(), "Data calculated on the client side.");
    }




















}
