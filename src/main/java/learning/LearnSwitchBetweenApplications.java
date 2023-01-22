package learning;

import wrappers.CommonNativeWrappers;
import wrappers.GenericWrappers;

public class LearnSwitchBetweenApplications {

    public static void main(String[] args) {
        GenericWrappers gm = new GenericWrappers();
        gm.launchAndroidApp("my device", "", "", "", "/apks/leaforg.apk");
        gm.enterValue(gm.getWebElement(CommonNativeWrappers.Locators.CLASS_NAME.asString(), "android.widget.EditText"), "rajkumar@testleaf.com");
        gm.enterValue(gm.getWebElement(CommonNativeWrappers.Locators.XPATH.asString(), "(//android.widget.EditText)[2]"), "Leaf@123");
        gm.click(gm.getWebElement(CommonNativeWrappers.Locators.CLASS_NAME.asString(), "android.widget.Button"));
        // To install an app
        //gm.verifyAndInstallApp("com.amazon.mShop.android.shopping",System.getProperty("user.dir")+"/apks/amazon.apk");
        gm.switchToAnotherApp("com.amazon.mShop.android.shopping");
        gm.switchToAnotherApp("com.testleaf.leaforg");
        gm.sleep(5000);
        gm.stopRunningApp("com.testleaf.leaforg");
        gm.switchToAnotherApp("com.testleaf.leaforg");
        gm.startAnAppUsingActivity("com.amazon.mShop.android.shopping", "com.amazon.mShop.home.HomeActivity");
    }

}
