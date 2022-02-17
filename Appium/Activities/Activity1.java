package Activities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity1 {
    //define driver
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        //Desiredcapabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "appiumClass:5554");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("noReset", "true");

        //initialize driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }

    @Test
    public void  multiply() {
        //click the number 5 using id
        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
        //click multiply button
        driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
        //click on number 9
        driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
        //click on equals to
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

        String result = driver.findElement(By.id("result_final")).getText();
        System.out.println(result);

        //assertion
        Assert.assertEquals(result, "45");

    }

    @AfterClass
    public void tearDown() {
        //close app
        driver.quit();
    }
}
