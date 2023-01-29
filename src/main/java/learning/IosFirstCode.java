package learning;

import org.testng.annotations.Test;
import wrappers.GenericWrappers;

public class IosFirstCode extends GenericWrappers {

    @Test
    public void runCode() {
       launchIosApp("iPhone 14 Pro","B88361EF-6968-4345-AB1B-19C8A814BB67","","","/apks/UICatalog.zip");
       click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Action Sheets"));
       click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "Okay / Cancel"));
       click(getWebElement(Locators.ACCESSIBILITY_ID.asString(), "OK"));

    }
}
