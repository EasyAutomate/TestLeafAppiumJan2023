package learning;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.MutableCapabilities;
import org.testng.annotations.Test;
import wrappers.GenericWrappers;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IosFirstCodeInSauceLabs extends GenericWrappers {

    @Test
    public void runCode() throws MalformedURLException {
        MutableCapabilities caps = new MutableCapabilities();
        caps.setCapability("platformName", "iOS");
        caps.setCapability("appium:app", "storage:filename=UICatalog.zip"); // The filename of the mobile app
        caps.setCapability("appium:deviceName", "iPhone 13 Simulator");
        caps.setCapability("appium:platformVersion", "16.1");
        caps.setCapability("appium:automationName", "XCUITest");
        MutableCapabilities sauceOptions = new MutableCapabilities();
        sauceOptions.setCapability("appiumVersion", "2.0.0-beta44");
        sauceOptions.setCapability("build", "<your build id>");
        sauceOptions.setCapability("name", "<your test name>");
        caps.setCapability("sauce:options", sauceOptions);
        URL url = new URL("https://oauth-lk8405950-7326e:fddeec9d-189f-439a-9970-89cf9a89d614@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        IOSDriver driver = new IOSDriver(url, caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(AppiumBy.accessibilityId("Action Sheets")).click();
        driver.findElement(AppiumBy.accessibilityId("Okay / Cancel")).click();
        driver.findElement(AppiumBy.accessibilityId("OK")).click();
        driver.quit();
    }
}
