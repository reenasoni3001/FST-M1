package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");

    }

    @Test
    public void exampleTest() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Target Practice", title);
    }
    @Test
    public void find(){
       WebElement button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[3]"));
       Assert.assertTrue(button.isDisplayed());
       Assert.assertEquals(button.getText(), "black");
    }
    @Test(enabled = false)
    public void wrong(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Target Practice", title);

    }
    @Test
    public void skip(){
        throw new SkipException("skip this test case");
    }


    @AfterMethod
    public void after() {
        driver.quit();
    }
}

