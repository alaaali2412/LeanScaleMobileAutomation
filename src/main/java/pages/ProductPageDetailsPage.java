package pages;

import base.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

import java.util.List;

public class ProductPageDetailsPage extends PageBase {
    public ProductPageDetailsPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Save")
    private AndroidElement wishlistBtn;

    @AndroidFindBy(accessibility = "BACK")
    private AndroidElement backBtn;

    @AndroidFindBy(id = "com.zzkko:id/btn_buy")
    private AndroidElement addToBagBtn;

    @AndroidFindBy(id = "com.zzkko:id/tv_name")
    private AndroidElement productName;

    @AndroidFindBy(id = "com.zzkko:id/tv_size")
    private List<AndroidElement> sizes;

    @AndroidFindBy(id = "com.zzkko:id/bag_count")
    private AndroidElement bagItemCount;


    public void clickBackBtn() {
        clickButton(backBtn);
    }


    public void addProductToBag() {
        clickButton(addToBagBtn);
        clickButton(sizes.get(2));
        clickButton(addToBagBtn);
    }

    public void assertThatItemAddedToBag() {
        Assert.assertEquals(bagItemCount.getText(), "1");
    }

    public void clickWishlistBtn() {
        clickButton(wishlistBtn);
    }


}
