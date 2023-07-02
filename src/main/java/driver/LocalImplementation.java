package driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LocalImplementation implements IDriverImplementation {


    @Override
    public WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")
                + "/src/test/resources/apks/ApiDemos-debug.apk");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability("autoGrantPermissions", true);
        return new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }
}
