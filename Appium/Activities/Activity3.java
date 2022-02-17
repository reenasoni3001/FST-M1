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

public class Activity3 {
    //define driver
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        //Desired capabilities
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
        //click on number 1
        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();
        //click on number 0
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        //click on number 0
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        //click on equals to
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

        String result = driver.findElement(By.id("result_final")).getText();
        System.out.println(result);

        //assertion
        Assert.assertEquals(result, "500");

    }

    @Test
    public void add() {
        //click the number 5 using id
        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
        //click add button
        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
        //click on number 9
        driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
        //click on number 0
        //driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        //click on number 0
        //driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        //click on equals to
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

        String result = driver.findElement(By.id("result_final")).getText();
        System.out.println(result);

        //assertion
        Assert.assertEquals(result, "14");


    }

    @Test
    public void minus() {
        //click the number 1 using id
        driver.findElement(By.id("com.google.android.calculator:id/digit_1")).click();

        //click on number 0
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        //click minus button
        driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
        //click on number 5
        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();

        //click on number 0
        //driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        //click on equals to
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

        String result = driver.findElement(By.id("result_final")).getText();
        System.out.println(result);

        //assertion
        Assert.assertEquals(result, "5");


    }

    @Test
    public void divide() {
        //click the number 5 using id
        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();

        //click on number 0
        driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        //click divide button
        driver.findElement(By.id("com.google.android.calculator:id/op_div")).click();
        //click on number 2
        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();

        //click on number 0
        //driver.findElement(By.id("com.google.android.calculator:id/digit_0")).click();
        //click on equals to
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();

        String result = driver.findElement(By.id("result_final")).getText();
        System.out.println(result);

        //assertion
        Assert.assertEquals(result, "25");


    }

    @AfterClass
    public void tearDown() {
        //close app
        driver.quit();
    }
}
