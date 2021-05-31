package pages;

import base.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends PageBase {
    public HomePage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Me")
    private AndroidElement profileBtn;

    @AndroidFindBy(accessibility = "Search")
    private AndroidElement searchBtn;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Wishlist']/android.widget.ImageView")
    private AndroidElement wishlistBtn;


    public void openProfilePage() {
        clickButton(profileBtn);
    }

    public void clickSearchIcon() {
        clickButton(searchBtn);
    }

    public void openWishlistPage() {
        clickButton(wishlistBtn);
    }
}
