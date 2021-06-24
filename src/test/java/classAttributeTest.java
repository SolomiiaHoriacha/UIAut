import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classAttributeTest  {


    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }
    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
    @Test
    public void ClassAttributeTest() {
    HomePage homePage = new HomePage(driver);
    classAttributePage classAttributePage = new classAttributePage(driver);
    driver.get(Utils.BASE_URL);
    homePage.openClassAttributePage();
    classAttributePage.clickOnPrimaryButton();
    classAttributePage.clickAlertOKButton();

    }
}