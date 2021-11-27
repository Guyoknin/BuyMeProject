package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class HomePage extends TestBase {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void pickPricePoint() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[data-option-array-index='3']")));
        driver.findElement(Constants.selectShekels).click();
    }

    public void pickRegion() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[data-option-array-index='2']")));
        driver.findElement(Constants.selectArea).click();
    }

    public void pickCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("li[data-option-array-index= 3']")));
        driver.findElement(Constants.selectCategory).click();
    }

    public void clickFindMeAGiftButton() {
        driver.findElement(Constants.findMeAGiftButton).click();
    }




}
