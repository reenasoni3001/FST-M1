package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeMethod (alwaysRun = true)
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");

    }

    @Test(groups = { "HeaderTests", "ButtonTests"})
    public void pageTitle() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Target Practice", title);
    }
    @Test (dependsOnMethods = {"pageTitle"}, groups = {"HeaderTests"})
    public void thirdHeader() {
        WebElement third = driver.findElement(By.id("third-header"));
        Assert.assertEquals("Third header", third.getText());

        WebElement fifthHeader = driver.findElement(By.cssSelector("h3#third-header"));
        Assert.assertEquals(fifthHeader.getCssValue("color"), "rgb(251, 189, 8)");
    }
    @Test (dependsOnMethods = {"pageTitle"}, groups = {"HeaderTests"})
    public void buttons(){
        WebElement olive = driver.findElement(By.cssSelector("button.olive"));

        Assert.assertEquals("Olive", olive.getText());

        WebElement teal = driver.findElement(By.cssSelector("button.brown"));
        Assert.assertEquals(teal.getCssValue("color"), "rgb(255, 255, 255)");

    }

    @AfterMethod (alwaysRun = true)
    public void after() {
        driver.quit();
    }
}

