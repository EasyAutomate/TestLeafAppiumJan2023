package learning;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

public class AndroidFirstCodeUsingAppPackageAndAppActivity {
	@Test
	public void runCode() throws MalformedURLException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:deviceName", "my device");
		dc.setCapability("appium:appPackage", "com.testleaf.leaforg");
		dc.setCapability("appium:appActivity", "com.testleaf.leaforg.MainActivity");
		AppiumDriver driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("android.widget.EditText")).sendKeys("rajkumar@testleaf.com");
		driver.findElement(By.xpath("(//android.widget.EditText)[2]")).sendKeys("Leaf@123");
		driver.findElement(By.className("android.widget.Button")).click();
		//driver.quit();
	}
}
