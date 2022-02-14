package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class Activity10_2 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");

        Actions actions = new Actions(driver);
        String pressedKeyText;

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //find the cube
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));

        //create action sequence
        Action actionSeq = actions.sendKeys("S").build();
        actionSeq.perform();
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
        pressedKeyText = pressedKey.getText();
        System.out.println(pressedKeyText);

        //Create action sequence for Spacebar
        Action actionSequence2 = actions
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .build();
        actionSequence2.perform();
        pressedKeyText = pressedKey.getText();
        System.out.println("Pressed key is: " + pressedKeyText);

        //Close browser
        driver.close();


    }
}