package testCases;

import base.SetUpConnection;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductPageDetailsPage;
import pages.SearchPage;

public class TC04_AddProductToCartTest extends SetUpConnection {

    AndroidDriver driver = startDriver();

    @Test
    public void addProductToCart() {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = new SearchPage(driver);
        ProductPageDetailsPage productPageDetailsPage = new ProductPageDetailsPage(driver);

        homePage.clickSearchIcon();
        searchPage.searchAnItem("women blouses", 2);
        productPageDetailsPage.addProductToBag();
        productPageDetailsPage.assertThatItemAddedToBag();

    }
}
