package Activities;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;


    @BeforeClass
    public void before(){
        driver = new FirefoxDriver();
        Reporter.log("Starting test");
        driver.get(" https://www.training-support.net/selenium/javascript-alerts");
        Reporter.log("open browser");
    }

    @BeforeMethod
    public void method(){
        Reporter.log("test case setup");
        driver.switchTo().defaultContent();
    }

    @Test (priority = 0)
    public void simpleAlertTestCase() {
        driver.findElement(By.id("simple")).click();
        Reporter.log("simple alert box opened");
        Alert simpleAlert = driver.switchTo().alert();
        Reporter.log("switch to alert");

        String alertText = simpleAlert.getText();
        Reporter.log("alert text :" + alertText);

        Assert.assertEquals("This is a JavaScript Alert!" , alertText);

        simpleAlert.accept();
        Reporter.log("alert got accepted");

        Reporter.log("test case ended");

    }

    @Test(priority = 1)
    public void confirmAlertTestCase(){
        Reporter.log("testcase 2 started");

        driver.findElement(By.id("confirm")).click();
        Reporter.log("confirm alert opened");
        Alert confirmAlert = driver.switchTo().alert();
        Reporter.log("switched to the alert");

        String alertText = confirmAlert.getText();
        Reporter.log("Alert message :" + alertText);

        Assert.assertEquals("This is a JavaScript Confirmation!" , alertText);

        confirmAlert.accept();
        Reporter.log("alert closed");
        Reporter.log("testcase enede");

    }

    @Test(priority = 2)
    public void promptAlertTestCase(){
        Reporter.log("Last test case");

        driver.findElement(By.id("prompt")).click();
        Reporter.log("alert click");

        Alert promptAlert = driver.switchTo().alert();
        Reporter.log("switch to alert");

        String alertText = promptAlert.getText();
        Reporter.log("alert :" + alertText);

        Assert.assertEquals("This is a JavaScript Prompt!" , alertText);

        promptAlert.accept();
        Reporter.log("alert closed");


    }

    @AfterClass
    public void tearDown() {
        Reporter.log("Ending Test |");
        //Close the driver
        driver.quit();
    }
}
