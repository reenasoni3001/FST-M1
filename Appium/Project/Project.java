package Activities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Project {
    //define driver
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() throws MalformedURLException {
        //Desiredcapabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "appiumClass:5554");
        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.dialer");
        caps.setCapability("appActivity", ".main.impl.MainActivity");
        caps.setCapability("noReset", "true");

        //initialize driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    }
    @Test
    public void googletask() {
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Create new task']").click();
        //MobileElement taskbutton=driver.findElementByXPath("//*[@text='New task']");

        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='New task']")));

        driver.findElementByXPath("//*[@text='New task']").sendKeys("Complete Activity with Google Tasks");
        driver.findElementById("add_task_done").click();
        System.out.println("task actvity added " );
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Create new task']")));
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Create new task']").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='New task']")));
        driver.findElementByXPath("//*[@text='New task']").sendKeys("Complete Activity with Google Keep");
        driver.findElementById("add_task_done").click();
        System.out.println("keep actvity added " );
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.ImageButton[@content-desc='Create new task']")));
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Create new task']").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='New task']")));
        driver.findElementByXPath("//*[@text='New task']").sendKeys("Complete the second Activity Google Keep");
        driver.findElementById("add_task_done").click();
        System.out.println("second keep act added" );

        MobileElement taskact = driver.findElementByXPath("//*[@text='Complete Activity with Google Tasks']");
        Assert.assertTrue(taskact.isDisplayed());
        MobileElement keepact = driver.findElementByXPath("//*[@text='Complete Activity with Google Keep']");
        Assert.assertTrue(keepact.isDisplayed());
        MobileElement secondkeepact = driver.findElementByXPath("//*[@text='Complete the second Activity Google Keep']");
        Assert.assertTrue(secondkeepact.isDisplayed());
        System.out.println("all 3tasks are displayed" );

    }
    @Test
    public void googlekeep() {
        driver.findElementById("new_note_button").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//*[@text='Title']")));
        driver.findElementByXPath("//*[@text='Title']").sendKeys("fst-notes");
        System.out.println("title added " );
        driver.findElementByXPath("//*[@text='Note']").sendKeys("vai google keep notes");
        System.out.println("note added " );
        driver.findElementByXPath("//*[@content-desc='Open navigation drawer']").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.id("browse_note_interior_content")));
        System.out.println("clicked back button  " );
        MobileElement note_title=driver.findElementByXPath("//*[@text='fst-notes']");
        Assert.assertTrue(note_title.isDisplayed());
        System.out.println("keep activity done" );
    }


    @AfterClass
    public void tearDown() {
        //close app
        driver.quit();
    }
}
