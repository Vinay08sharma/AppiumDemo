import driver.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class BaseTest {

    @BeforeTest
    public void init() throws MalformedURLException {
        Driver.initDriver();
    }

    @AfterTest
    public void quit() {
        Driver.quitDriver();
    }
}
