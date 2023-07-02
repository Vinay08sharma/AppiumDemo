package driver;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public final class DriverFactory {

    static WebDriver driver = null;

    private DriverFactory() {
    }

    public static WebDriver get(Mode mode) throws MalformedURLException {
        if (mode.equals(Mode.LOCAL)) {
            driver = new LocalImplementation().getDriver();
        } else if (mode.equals(Mode.BS)) {
            driver = new BrowserstackImplementation().getDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            DriverManager.unLoad();
            driver.quit();
        }
    }
}
