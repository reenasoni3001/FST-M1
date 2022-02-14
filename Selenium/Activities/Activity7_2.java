package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {
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
        WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        WebElement Confirm = driver.findElement(By.xpath("//*[@id='dynamic-attributes-form']/div/div[3]/input"));
        WebElement email = driver.findElement(By.xpath("//*[@id='dynamic-attributes-form']/div/div[4]/input"));
        //Type credentials
        userName.sendKeys("ree");
        password.sendKeys("password");
        Confirm.sendKeys("password");
        email.sendKeys("ree@gamil.com");



        //sign up
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();


        String text = driver.findElement(By.xpath("//*[@id='action-confirmation']")).getText();
        System.out.println(text);


    }

}
