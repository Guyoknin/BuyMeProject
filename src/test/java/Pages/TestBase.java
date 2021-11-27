package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver = null;
    public WebDriverWait wait = null;

    public void initializeDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        if (wait == null) {
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get(Constants.buyMeURL);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    }

    public void assertBusinessURL () {
        Assert.assertEquals(Constants.buyMeURL, Constants.expectedBusinessURL);
    }

    public void login() {
        BasePage page = new BasePage(driver);
        page.findWebElement(Constants.loginButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".register-or-login")));
        page.findWebElement(Constants.emailField).sendKeys(Constants.email);
        page.findWebElement(Constants.passwordField).sendKeys(Constants.password);
        page.findWebElement(Constants.submitButton).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ghost > a[gtm='superVoucherLinkloggedIn']")));
    }
}