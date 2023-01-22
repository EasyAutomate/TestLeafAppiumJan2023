package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class LearnHybridAppsWithMultipleWebView extends GenericWrappers {

    @Test
    public void runCode() {
        launchAndroidApp("my device", "", "", "", "/apks/TheApp-v1.10.0.apk");
        click(getWebElement(Locators.XPATH.asString(), "//*[@text='Dual Webview Demo']"));
        sleep(3000);
        String text1 = getText(getWebElement(Locators.XPATH.asString(), "(//android.view.View)[1]"));
        String text2 = getText(getWebElement(Locators.XPATH.asString(), "(//android.view.View)[2]"));
        System.out.println(text1);
        System.out.println(text2);
        printContext();
        switchContext("WEBVIEW_io.cloudgrey.the_app");
        switchToFirstWindow();
        String text3 = getText(getWebElement(Locators.XPATH.asString(), "(//h2)[1]"));
        switchToLastWindow();
        String text4 = getText(getWebElement(Locators.XPATH.asString(), "(//h2)[1]"));
        System.out.println(text3);
        System.out.println(text4);

    }
}
