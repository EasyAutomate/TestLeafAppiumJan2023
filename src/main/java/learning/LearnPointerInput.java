package learning;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

public class LearnPointerInput {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("appium:app", System.getProperty("user.dir") + "/apks/MultiTouch Tester_v1.2.apk");
        dc.setCapability("appium:deviceName", "my emulator");
        dc.setCapability("noReset", true);
        // dc.setCapability("platformName", "Android");
        // AppiumDriver driver = new AppiumDriver(new
        // URL("http://0.0.0.0:4723/wd/hub"),dc);
        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), dc);
        Thread.sleep(3000);
        int maxX = driver.manage().window().getSize().getWidth();
        int maxY = driver.manage().window().getSize().getHeight();
        int startX = (int) (maxX * 0.5);
        int startY = (int) (maxY * 0.8);
        int endX = (int) (maxX * 0.5);
        int endY = (int) (maxY * 0.2);
        //Swipe up
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "index finger");
        Sequence swipeUp = new Sequence(finger, 1);
        swipeUp.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
        swipeUp.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeUp.addAction(finger.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), endX, endY));
        swipeUp.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipeUp));
        Thread.sleep(3000);
        //SwipeDown
        PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "index finger");
        Sequence swipeDown = new Sequence(finger1, 1);
        swipeDown.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), endX, endY));
        swipeDown.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeDown.addAction(finger1.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), startX, startY));
        swipeDown.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipeDown));
        Thread.sleep(3000);
        int startXX = (int) (maxX * 0.8);
        int startYY = (int) (maxY * 0.5);
        int endXX = (int) (maxX * 0.2);
        int endYY = (int) (maxY * 0.5);
        //Swipe left
        PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "index finger");
        Sequence swipeLeft = new Sequence(finger2, 1);
        swipeLeft.addAction(finger2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startXX, startYY));
        swipeLeft.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeLeft.addAction(finger2.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), endXX, endYY));
        swipeLeft.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipeLeft));
        Thread.sleep(3000);
        //Swipe right
        PointerInput finger3 = new PointerInput(PointerInput.Kind.TOUCH, "index finger");
        Sequence swipeRight = new Sequence(finger3, 1);
        swipeRight.addAction(finger3.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), endXX, endYY));
        swipeRight.addAction(finger3.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipeRight.addAction(finger3.createPointerMove(Duration.ofMillis(2000), PointerInput.Origin.viewport(), startXX, startYY));
        swipeRight.addAction(finger3.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipeRight));
        driver.quit();
    }
}