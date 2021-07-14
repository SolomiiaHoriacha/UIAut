import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class verifyTextTest {


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
    public void verifyTextTest() {
        HomePage homePage = new HomePage(driver);
        verifyTextPage verifyTextPage = new verifyTextPage(driver);
        driver.get(Utils.BASE_URL);
        homePage.openVerifyTextPage();
        Assert.assertEquals(verifyTextPage.getFieldName(), "Welcome UserName!");
    }

}
