package Pages;

import org.openqa.selenium.WebDriver;

public class InformationScreen extends TestBase {

    private WebDriver driver;

    public InformationScreen(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSomoneElseButton() {
        driver.findElement(Constants.somoneElseButtonClick).click();
    }

    public void enterRecieverName() {
        driver.findElement(Constants.enterRecieverName).sendKeys(Constants.reciverName);
    }

    public void pickAnEvent() {
        driver.findElement(Constants.chooseEventDropDown).click();
    }

    public void enterABlessing() {
        driver.findElement(Constants.blesssingText).sendKeys(Constants.blessing);
    }

    public void clickContinueButton() {
        driver.findElement(Constants.clickContinueButton).click();
    }

    public void clickRadioButtonNow() {
        driver.findElement(Constants.radioButtonNowClick).click();
    }

    public void clickOnEmailOption() {
        driver.findElement(Constants.emailOptionClick).click();
    }

    public void enterEmailToReciever() {
        driver.findElement(Constants.emailToReciever).sendKeys(Constants.customeEmailToReciever);
    }

    public void enterSenderName() {
        driver.findElement(Constants.enterSenderNamer).sendKeys(Constants.senderName);
    }

    public void clickOnContinuePaymentButton() {
        driver.findElement(Constants.clickContinueToPayment).click();
    }






}
