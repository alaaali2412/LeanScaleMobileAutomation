package pages;

import base.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class BagPage extends PageBase {
    public BagPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.zzkko:id/bag_title_tv")
    private AndroidElement itemsTitle;

    public String getItemName() {
        return itemsTitle.getText();
    }

}