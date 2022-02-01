package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");

        String title = driver.getTitle();
        System.out.println(title);

        //using id
        WebElement idLocator = driver.findElement(By.id("about-link"));
        System.out.println(idLocator.getText());

        //using className
        WebElement classNameLocator = driver.findElement(By.className("ui inverted huge green button"));
        System.out.println("Text in element: " + classNameLocator.getText());

        //using css selector
        WebElement cssSelector = driver.findElement(By.cssSelector(".green"));
        System.out.println(cssSelector.getText());

        //using linktext
        WebElement linkText = driver.findElement(By.linkText("About Us"));
        System.out.println(linkText.getText());

        //closing the browser
        driver.close();
        
    }
}
