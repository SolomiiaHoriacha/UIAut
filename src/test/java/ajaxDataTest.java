import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ajaxDataTest{

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
    public void ajaxDataTest() {
        HomePage homePage = new HomePage(driver);
        ajaxDataPage ajaxDataPage = new ajaxDataPage(driver);
        driver.get(Utils.BASE_URL);
        homePage.openAjaxDataPage();
        ajaxDataPage.clickOnAjaxButton();
        driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
        Assert.assertEquals(ajaxDataPage.getAjaxFieldText(), "Data loaded with AJAX get request.");
    }






































}
