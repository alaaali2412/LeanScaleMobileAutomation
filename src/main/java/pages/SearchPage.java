package pages;

import base.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class SearchPage extends PageBase {
    public SearchPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.zzkko:id/tv_searchbar_box")
    private AndroidElement searchField;

    @AndroidFindBy(id = "com.zzkko:id/root_container")
    private List<AndroidElement> items;



    public void searchAnItem(String itemName, int item) {
        searchField.sendKeys(itemName);
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        clickButton(items.get(item));
    }
}