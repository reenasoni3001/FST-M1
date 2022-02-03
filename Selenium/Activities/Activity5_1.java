package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {
    public static void main(String[] args) {
        //creating intance
        WebDriver driver = new FirefoxDriver();
        //open browser
        driver.get("https://training-support.net/selenium/dynamic-controls");

        //pint the page title
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //find the checkbox
        WebElement checkbox = driver.findElement(By.xpath("//*[@id='dynamicCheckbox']/input"));
        System.out.println(checkbox.isDisplayed());

        //click remove checkbox
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println(checkbox.isDisplayed());

        driver.close();




    }
}
