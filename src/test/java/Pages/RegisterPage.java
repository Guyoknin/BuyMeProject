package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public RegisterPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnloginButton() {
        findWebElement(Constants.loginButton).click();
    }

    public void clickOnRegisterButton() {
        findWebElement(Constants.registerButton).click();
    }

    public void setFirstName() {
       findWebElement(Constants.firstNameField).sendKeys(Constants.firstName);

    }

    public void setEmailRegister() {
        findWebElement(Constants.emailFieldRegister).sendKeys(Constants.email);

    }

    public void setPasswordRegister() {
        findWebElement(Constants.passwordFieldRegister).sendKeys(Constants.password);
    }

    public void repeatPassword() {
        findWebElement(Constants.repeatPassword).sendKeys(Constants.password);
    }

    public void submitRegister() {
        findWebElement(Constants.submitButtonRegister).click();

    }


}
