package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;

public class SetUpConnection extends StartAppiumServer {
    @BeforeSuite
    public void startConnection() {
        int port = 4723;
        if (!checkIfServerIsRunnning(port)) {
            startServer();
        } else {
            stopServer();
            startServer();
        }
    }


    public AndroidDriver<AndroidElement> startDriver() {
        runCommand("emulator -avd version_11");
        try {
            driver = new AndroidDriver(new URL(startServer()), capabilities());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }


    @AfterSuite
    public void stopServer() {
        driver.closeApp();
        service.stop();
    }
}
