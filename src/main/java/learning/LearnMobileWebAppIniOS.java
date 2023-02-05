package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

import java.time.Duration;

public class LearnMobileWebAppIniOS extends GenericWrappers {
    @Test
    public void runCode() {
        launchSafariBrowser("iPhone 14 Pro", "http://www.google.com", "00008030-000A708E01F0C02E", "");
        enterValue(getWebElement(Locators.NAME.asString(), "q"), "Lokesh");
        sleep(2000);
        clickWebElementUsingCoOrdinatesWithAdditionalValues(getWebElement(Locators.NAME.asString(), "q"),0,50);
        switchNativeview();
        click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Go"));
        switchWebView();

    }
}
