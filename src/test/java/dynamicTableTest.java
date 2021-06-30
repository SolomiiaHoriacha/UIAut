import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamicTableTest {

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
    public void testOpenDynamicTablePage() {
       HomePage homePage = new HomePage(driver);
       dynamicTablePage dynamicTablePage = new dynamicTablePage(driver);
        driver.get(Utils.BASE_URL);
       homePage.openDynamicTablePage();
       String valueOfCPUwarningMessage = dynamicTablePage.getWarningCPUMessage();
       String valueOfCPUfromTable = dynamicTablePage.getCPUFromTaskManagerTable();
       Assert.assertEquals(valueOfCPUwarningMessage, valueOfCPUfromTable);


    }





















}




























