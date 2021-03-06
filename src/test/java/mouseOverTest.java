import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class mouseOverTest {

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
    public void mouseOverTest () {
        HomePage homePage = new HomePage(driver);
        mouseOverPage mouseOverPage = new mouseOverPage(driver);
        driver.get(Utils.BASE_URL);
        homePage.openMouseOverPage();
        mouseOverPage.doubleClickButton();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Assert.assertEquals(mouseOverPage.getCount(),"2");
    }


























}
