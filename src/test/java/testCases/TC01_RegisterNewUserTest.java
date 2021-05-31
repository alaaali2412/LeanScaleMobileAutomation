package testCases;

import base.SetUpConnection;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;

public class TC01_RegisterNewUserTest extends SetUpConnection {
    AndroidDriver driver = startDriver();

    @Test
    public void test() {
        HomePage homePage = new HomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.openProfilePage();
        profilePage.clickLoginBtn();
        loginPage.addEmailAndPassword();
        loginPage.clickRegisterBtn();

    }
}