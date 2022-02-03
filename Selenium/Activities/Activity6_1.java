package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        //creating intance
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //open browser
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //pint the page title
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //check the toggle button
        WebElement checkbox = driver.findElement(By.xpath("//*[@id='toggleCheckbox']"));
        WebElement toggle = driver.findElement(By.id("toggleCheckbox"));
        checkbox.click();

        //Wait for checkbox to disappear
        wait.until(ExpectedConditions.invisibilityOf(toggle));

        toggle.click();

        wait.until(ExpectedConditions.visibilityOf(toggle));
        toggle.click();

        driver.close();

    }
}

