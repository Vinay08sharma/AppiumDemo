import driver.Driver;
import driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DemoTest1 extends BaseTest {

    @Test
    public void Test2 () {

        DriverManager.getDriver().findElement(By.id("android:id/button1")).click();
        DriverManager.getDriver().findElement(By.id("android:id/text1")).click();
        String text = DriverManager.getDriver().findElement(By.xpath("//*[contains(@text,'API Demos')]")).getText();
        System.out.println(text);
        DriverManager.getDriver().findElement(By.xpath("//android.widget.TextView[@index = '5']")).click(); // indexing in appium
    }
}