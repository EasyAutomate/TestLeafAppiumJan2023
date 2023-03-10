package learning;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidFirstCodeToIdentifyCorrectAppPackageAndAppActivity {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("appium:deviceName", "my device");
        dc.setCapability("appium:appPackage", "com.amazon.mShop.android.shopping");
        dc.setCapability("appium:appActivity", "com.amazon.mShop.home.HomeActivity");
        dc.setCapability("appium:app", System.getProperty("user.dir") + "/apks/amazon.apk");
        AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
        driver.quit();
    }
}
