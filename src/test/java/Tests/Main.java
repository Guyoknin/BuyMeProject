package Tests;

import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Main extends TestBase {

    @BeforeClass
    public void setUP() {
        initializeDriver();
    }

    @Test
    public void registerToBuyMe() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.clickOnloginButton();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Constants.waitForPopupElement));
        registerPage.clickOnRegisterButton();
        registerPage.setFirstName();
        registerPage.setEmailRegister();
        registerPage.setPasswordRegister();
        registerPage.repeatPassword();
        registerPage.submitRegister();
    }

    @Test
    public void loginToBuyMe() {
        login();
    }

    @Test
    public void findAGift() {
        HomePage homePage = new HomePage(driver);
        homePage.pickPricePoint();
        homePage.pickRegion();
        homePage.pickCategory();
        homePage.clickFindMeAGiftButton();
    }

    @Test
    public void assertWebURL() {
        TestBase testBase = new TestBase();
        testBase.assertBusinessURL();
    }

    @Test
    public void pickABusinessTest() {
        BusinessPage businessPage = new BusinessPage(driver);
        businessPage.pickABusiness();
        businessPage.choosePriceForBusiness();
        businessPage.clickChooseButton();
    }

    @Test
    public void sendGiftByMail() {
        InformationScreen informationScreen = new InformationScreen(driver);
        informationScreen.clickOnSomoneElseButton();
        informationScreen.enterRecieverName();
        informationScreen.pickAnEvent();
        informationScreen.enterABlessing();
        informationScreen.clickContinueButton();
        informationScreen.clickRadioButtonNow();
        informationScreen.clickOnEmailOption();
        informationScreen.enterEmailToReciever();
        informationScreen.enterSenderName();
        informationScreen.clickOnContinuePaymentButton();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
