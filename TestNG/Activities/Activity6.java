package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/login-form");

    }

    @Test
    @Parameters({"user" , "passwrd"})
    public void login(String user, String passwrd) {
        WebElement username1 = driver.findElement(By.id("username"));
        WebElement password1 = driver.findElement(By.id("password"));

        username1.sendKeys("user");
        password1.sendKeys("passwrd");

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
