package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) {
        //creating intance
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //open browser
        driver.get("https://training-support.net/selenium/dynamic-attributes");

        //pint the page title
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //Find username and password fields
        WebElement userName = driver.findElement(By.xpath("//*[@id='dynamic-attributes-form']/div/div[1]/input"));
        WebElement password = driver.findElement(By.xpath("//*[@id='dynamic-attributes-form']/div/div[2]/input"));
        //Type credentials
        userName.sendKeys("admin");
        password.sendKeys("password");

        driver.findElement(By.xpath("//*[@id='dynamic-attributes-form']/div/button")).click();

        String text = driver.findElement(By.xpath("//*[@id='action-confirmation']")).getText();
        System.out.println(text);
        driver.close();

    }
}
