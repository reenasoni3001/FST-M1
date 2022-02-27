package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/login-form");

    }

    @Test
    public void login() {
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("admin");
        password.sendKeys("password");

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

