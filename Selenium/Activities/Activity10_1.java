package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Activity10_1 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");

        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //find the cube
        WebElement cube = driver.findElement(By.id("wrapD3Cube"));

        //left click
        Actions actions = new Actions(driver);
        actions.click(cube);
        WebElement value = driver.findElement(By.className("active"));
        System.out.println(value.getText());

        //double click
        actions.doubleClick(cube);
        value = driver.findElement(By.className("active"));
        System.out.println(value.getText());

        //right click
        actions.contextClick(cube).perform();
        value = driver.findElement(By.className("active"));
        System.out.println(value.getText());


        driver.close();




    }
}
