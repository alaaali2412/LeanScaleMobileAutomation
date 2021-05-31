package testCases;

import base.SetUpConnection;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;

public class TC02_SocialLoginTest extends SetUpConnection {
    AndroidDriver driver = startDriver();

    @Test
    public void loginWithGoogleAccount() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.openProfilePage();
        profilePage.clickLoginBtn();
        loginPage.loginWithGoogle();
        profilePage.clickSettingBtn();
        profilePage.clickSignOutBtn();
    }

    @Test
    public void loginWithFacebookAccount() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ProfilePage profilePage = new ProfilePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        homePage.openProfilePage();
        profilePage.clickLoginBtn();
        loginPage.loginWithFacebook();
    }
}
