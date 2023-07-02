package driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackImplementation implements IDriverImplementation {

    public WebDriver getDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set your access credentials
        caps.setCapability("browserstack.user", "vinaysharma10");
        caps.setCapability("browserstack.key", "KnnoqzKykgqSxGzQ2yCH");

        // Set URL of the application under test
        caps.setCapability("app", "bs://01ef4b6667b2e04391333e87ce8a5ca10f6fbdd6");

        // Specify device and os_version for testing
        caps.setCapability("device", "Samsung Galaxy S10e");
        caps.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        caps.setCapability("project", "First Java Project");
        caps.setCapability("build", "browserstack-build-1");
        caps.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        return new AndroidDriver<AndroidElement>(
                new URL("http://hub.browserstack.com/wd/hub"), caps);

    }


}
