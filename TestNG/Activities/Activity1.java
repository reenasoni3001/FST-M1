package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");

    }

    @Test
    public void exampleTest() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Training Support", title);

        driver.findElement(By.id("about-link")).click();

        //print the title of the new page
        System.out.println(driver.getTitle());

        Assert.assertEquals( driver.getTitle(), "About Training Support");

    }

    @AfterMethod
    public void after() {
        driver.quit();
    }
}
