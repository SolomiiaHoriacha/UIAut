import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class clickTest {

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
    public void clickTest() {
        HomePage homePage = new HomePage(driver);
        clickPage clickPage = new clickPage(driver);
        driver.get(Utils.BASE_URL);
        homePage.openClickPage();
        clickPage.clickOnBadButton();


    }
}
