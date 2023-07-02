package driver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {

    private DriverManager() {
    }

    static ThreadLocal<WebDriver> tDriver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return tDriver.get();
    }

    public static void setDriver(WebDriver driver) {
        tDriver.set(driver);
    }

    public static void unLoad() {
        tDriver.remove();
    }
}
