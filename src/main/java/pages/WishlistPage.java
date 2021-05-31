package pages;

import base.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WishlistPage extends PageBase {
    public WishlistPage(AndroidDriver driver) {
        super(driver);
    }
    @AndroidFindBy(id = "com.zzkko:id/img")
    private AndroidElement item;


    public void openWishlistItem(){
        clickButton(item);
    }
}