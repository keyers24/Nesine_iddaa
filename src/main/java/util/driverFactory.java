package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class driverFactory {

    static AppiumDriver driver;
    static UiAutomator2Options options;
    public static AppiumDriver initialize_Driver(){
        File appDir = new File("src/test/resources/apps/");
        File app = new File(appDir, "nesine.com.apk");
                options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                .setUdid("emulator-5554")
                .setFullReset(false)
                .setNoReset(false)
                .setApp(app.getAbsolutePath());
//                .setAppPackage("com.pordiva.nesine.android")
//                .setAppActivity("com.nesine.ui.taboutside.splash.MainActivityDefault");

        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return getDriver();

    }
    public static AppiumDriver getDriver(){
        return driver;
    }
}
