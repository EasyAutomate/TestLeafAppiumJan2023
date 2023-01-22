package learning;

import io.appium.java_client.android.AndroidDriver;
import wrappers.GenericWrappers;

public class LearnWrapperInAndroid {

    public static void main(String[] args) {
        GenericWrappers gm = new GenericWrappers();
        gm.launchAndroidApp("my device", "", "", "", "/apks/leaforg.apk");
//         To install an app
        gm.verifyAndInstallApp("com.testleaf.leaforg", System.getProperty("user.dir") + "/apks/leaforg.apk");
//         To change orientation
        gm.setLandscapeOrientation();
        System.out.println(gm.getOrientation());

        gm.dataOffInAndroid();
        gm.dataOnInAndroid();
    }

}
