import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class dynamicIDTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
      
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test
    public static void findElementDynamicID(){
        driver.get(Utils.BASE_URL);    
        HomePage HomePage = new HomePage(driver); 
        HomePage.clickLinkDynamicID();  
        dynamicIDPage dynamicIDPage = new dynamicIDPage(driver);
        dynamicIDPage.clickWithDynamicID();
    }

    @AfterTest
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
