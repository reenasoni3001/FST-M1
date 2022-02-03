package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        //creating intance
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //open browser
        driver.get("https://training-support.net/selenium/ajax");

        //pint the page title
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //change content element
        WebElement change = driver.findElement(By.xpath("//*[@id='ajax-content']/button"));
        change.click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));

        //get the hello text
        String text = driver.findElement(By.xpath("//*[@id='ajax-content']/h1")).getText();
        System.out.println(text);


        //Wait for late text
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

        String latetext = driver.findElement(By.xpath("//*[@id='ajax-content']/h3")).getText();
        System.out.println(latetext);
        driver.close();






    }
}