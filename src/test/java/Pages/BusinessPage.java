package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BusinessPage extends TestBase {

    private WebDriver driver;

    public BusinessPage(WebDriver driver) {
        this.driver = driver;
    }

    public void pickABusiness() {
        driver.findElement(Constants.businessButton).click();
    }

    public void choosePriceForBusiness() {
        driver.findElement(Constants.insertAmountBusiness).sendKeys("50");
    }

    public void clickChooseButton() {
        driver.findElement(Constants.clickOnChooseButton).click();
    }


}
