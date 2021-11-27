package Pages;

import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy;
import org.openqa.selenium.By;

public class Constants {

    // General
    public static final String browserName = "chrome";
    public static final String buyMeURL = "https://buyme.co.il";
    public static final String expectedBusinessURL = "BuymeURL";

    // Login constants
    public static final String firstName = "Guy";
    public static final String email = "Guyokfin@gmail.com";
    public static final String password = "Aa123456";

    // LoginPage locators
    public static final By loginButton = By.className("seperator-link");
    public static final By emailField = By.cssSelector(".oldschool input[type='email']");
    public static final By passwordField = By.cssSelector(".oldschool input[type='password']");
    public static final By submitButton = By.cssSelector(".oldschool button[type=submit]");

    // RegisterPage locators
    public static final By registerButton = By.cssSelector(".register-or-login > .text-link");
    public static final By firstNameField = By.cssSelector(".oldschool input[placeholder='שם פרטי']");
    public static final By emailFieldRegister = By.cssSelector(".oldschool input[placeholder='מייל']");
    public static final By passwordFieldRegister = By.id("valPass");
    public static final By repeatPassword = By.cssSelector(".oldschool input[placeholder='אימות סיסמה']");
    public static final By submitButtonRegister = By.cssSelector(".oldschool button[type=submit]");
    public static final By waitForPopupElement = By.cssSelector(".register-or-login > .text-link");

    // HomePage locators
    public static final By selectShekels = By.cssSelector("li[data-option-array-index='1']");
    public static final By selectArea = By.cssSelector("li[data-option-array-index='2']");
    public static final By selectCategory = By.cssSelector("li[data-option-array-index= 3']");
    public static final By findMeAGiftButton = By.className("ui-btn");

    // BusinessPage locators
    public static final By businessButton = By.className("product-card-bg");
    public static final By insertAmountBusiness = By.id("ember1634");
    public static final By clickOnChooseButton = By.className("bm-btn");

    // InformationPage constants
    public static final String reciverName = "Test";
    public static final String blessing = "Test Blessing";
    public static final String customeEmailToReciever = "Guytest@test.com";
    public static final String senderName = "Guy";

    // InformationPage locators
    public static final By somoneElseButtonClick = By.className("button-forSomeone");
    public static final By enterRecieverName = By.id("ember1917");
    public static final By chooseEventDropDown = By.xpath("//*[@id=\"ember1936\"]");
    public static final By blesssingText = By.className("parsley-success");
    public static final By clickContinueButton = By.id("ember1763");
    public static final By radioButtonNowClick = By.className("check");
    public static final By emailOptionClick = By.xpath("//*[@id=\"ember1977\"]/div[2]/div[1]/svg/path[1]");
    public static final By emailToReciever = By.id("email");
    public static final By enterSenderNamer = By.id("ember1997");
    public static final By clickContinueToPayment = By.id("ember1998");










}
