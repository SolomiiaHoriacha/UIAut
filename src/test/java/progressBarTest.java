import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class progressBarTest {

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
    public void progressBarPage(){
        HomePage homePage = new HomePage(driver);
        progressBarPage progressBarPage = new progressBarPage(driver);
        WebDriverWait wait = new WebDriverWait(driver,15);//це очікуваняя чогось
        driver.get(Utils.BASE_URL);
        homePage.openProgressBarPage();
        progressBarPage.pressStartButton();
        wait.until(ExpectedConditions.textToBePresentInElement(progressBarPage.progress, "75%"));
        progressBarPage.pressStopButton();
        Assert.assertTrue(progressBarPage.getResult().contains("Result: 0"));



    }
}
