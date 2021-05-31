package pages;

import base.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends PageBase {
    public LoginPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }


    @AndroidFindBy(id = "com.zzkko:id/email_edt")
    private AndroidElement emailField;

    @AndroidFindBy(id = "com.zzkko:id/pwdEdtTxt")
    private AndroidElement passwordField;

    @AndroidFindBy(id = "com.zzkko:id/login_or_register_button")
    private AndroidElement registerBtn;

    @AndroidFindBy(accessibility = "Sign in with Facebook")
    private AndroidElement facebookBtn;

    @AndroidFindBy(accessibility = "Sign in with Google")
    private AndroidElement googleBtn;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    private AndroidElement googleEmailField;

    @AndroidFindBy(xpath = "//android.widget.EditText")
    private AndroidElement googlePasswordField;

    @AndroidFindBy(xpath = "//android.widget.Button")
    private List<AndroidElement> buttons;

    @AndroidFindBy(xpath = "//android.widget.CheckBox")
    private AndroidElement checkBox;


    public void addEmailAndPassword() {
        String email = generateRandomText(7) + "@mail.com";
        String password = generateRandomPassword(9);
        setPropertiesFileName("RegistrationData.properties");
        clearField(emailField);
        clearField(passwordField);
        addText(emailField, email);
        addText(passwordField, password);
        updateValueInPropertiesFile("Email", email);
        updateValueInPropertiesFile("Password", password);
    }

    public void clickRegisterBtn() {
        clickButton(registerBtn);
    }


    public void loginWithGoogle() throws InterruptedException {
        setPropertiesFileName("LoginData.properties");
        clickButton(googleBtn);

        clearField(googleEmailField);
        addText(googleEmailField, getValuesFromPropertiesFile("GoogleEmail"));
        clickButton(buttons.get(2));

        waitVisibilityOfElement(checkBox);
        clearField(googlePasswordField);
        addText(googleEmailField, getValuesFromPropertiesFile("GooglePassword"));
        clickButton(buttons.get(0));
        Thread.sleep(4000);
        clickButton(buttons.get(3));
        Thread.sleep(4000);
        clickButton(buttons.get(0));
    }

    public void loginWithFacebook(){
        clickButton(facebookBtn);
    }
}
