package testCases;

import base.SetUpConnection;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pages.*;

public class TC03_AddProductToWishlistTest extends SetUpConnection {

    AndroidDriver driver = startDriver();

    @Test
    public void addProductToWishlist() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ProductPageDetailsPage productPageDetailsPage = new ProductPageDetailsPage(driver);


        homePage.clickSearchIcon();
        searchPage.searchAnItem("women blouses", 2);
        productPageDetailsPage.clickWishlistBtn();
        loginPage.loginWithFacebook();
        productPageDetailsPage.clickBackBtn();
        searchPage.clickBackBtn();
        searchPage.clickBackBtn();
        homePage.openWishlistPage();


    }
}
