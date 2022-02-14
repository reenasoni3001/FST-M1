package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class Activity10_3 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/drag-drop");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));

        //select 3 elements
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement zone1 = driver.findElement(By.id("droppable"));
        WebElement zone2 = driver.findElement(By.id("dropzone2"));

        //complie a custom action for drag and drop
        Actions dragAndDrop = new Actions(driver);
        dragAndDrop.dragAndDrop(ball, zone1).build().perform();

        //wait for the colour to chnage of the zone1
        wait.until(ExpectedConditions.attributeToBeNotEmpty(zone1, "Background-color"));
        System.out.println("Entered zone1");

        dragAndDrop.dragAndDrop(ball, zone2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(zone2, "Background-color"));
        System.out.println("Entered zone1");

        driver.close();




    }
}