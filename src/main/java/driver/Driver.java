package driver;

import org.openqa.selenium.WebDriver;
import utils.PropertiesUtils;

import java.net.MalformedURLException;

import static driver.DriverManager.setDriver;

public class Driver {

//    private static WebDriver driver = null;

    private Driver() {
    }


    public static void initDriver() throws MalformedURLException {
        String modeValue = PropertiesUtils.getValue("mode");
        WebDriver driver = DriverFactory.get(Mode.valueOf(modeValue.toUpperCase())); // Converting string to enum;
        setDriver(driver);
    }

    public static void quitDriver() {
        DriverFactory.quitDriver();
    }

}
