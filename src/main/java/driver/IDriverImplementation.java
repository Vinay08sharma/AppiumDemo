package driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public interface IDriverImplementation {

    public WebDriver getDriver() throws MalformedURLException;
}
