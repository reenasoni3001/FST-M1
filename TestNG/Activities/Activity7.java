package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Activity7 {
    WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/login-form");

    }

    @DataProvider(name = "Authentication")
    public static Object[][] credentails(){
        return new Object[][] { { "admin", "password"}};
    }

    @Test (dataProvider = "Authentication")
    public void login(String username4, String password4) {
        WebElement username1 = driver.findElement(By.id("username"));
        WebElement password1 = driver.findElement(By.id("password"));

        username1.sendKeys("admin");
        password1.sendKeys("password");

        driver.findElement(By.xpath("//*[@id='dynamic-attributes-form']/div/button")).click();
        String success = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(success);
        Assert.assertEquals(success, "Welcome Back, admin");

    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}


