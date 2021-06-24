import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class dynamicIDTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test
    public static void findElementDynamicID(){
        driver.get(Utils.BASE_URL);    //переходимо на хоум пейдж
        HomePage HomePage = new HomePage(driver);  //створюємо екземпляр хоум пейдж
        HomePage.clickLinkDynamicID();  //клікаємо на динам ід лінк
        dynamicIDPage dynamicIDPage = new dynamicIDPage(driver); //створюємо екзимпляр динамік ід пейдж
        dynamicIDPage.clickWithDynamicID();// клікаємо на кнопку
    }

    @AfterTest
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
