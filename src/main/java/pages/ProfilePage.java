package pages;

import base.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends PageBase {
    public ProfilePage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.zzkko:id/unloginTv2")
    private AndroidElement loginBtn;

    @AndroidFindBy(accessibility = "Setting")
    private AndroidElement settingBtn;

    @AndroidFindBy(id = "com.zzkko:id/setting_log_out_layout")
    private AndroidElement signOutBtn;


    public void clickLoginBtn(){
        clickButton(loginBtn);
    }

    public void clickSettingBtn(){
        clickButton(settingBtn);
    }

    public void clickSignOutBtn(){
        clickButton(signOutBtn);
    }
}
