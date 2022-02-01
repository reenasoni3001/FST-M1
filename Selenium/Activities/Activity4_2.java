package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        //creating a intance
        WebDriver driver = new FirefoxDriver();
        //open browser
        driver.get("https://www.training-support.net/selenium/simple-form");

        //pint the page title
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //finding the input fields
        WebElement fName = driver.findElement(By.xpath("//*[@id='firstName']"));
        WebElement lName = driver.findElement(By.xpath("//*[@id='lastName']"));
        //enter in the input fields
        fName.sendKeys("Reena");
        lName.sendKeys("Soni");

        //email
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("reenaprahladsoni1@gmail.com");
        driver.findElement(By.xpath("//*[@id='number']")).sendKeys("3242324234");
        //submit
        driver.findElement(By.xpath("//*[@id='simpleForm']/div/div[6]/div[1]/input")).click();

        //close the browse
        driver.close();
    }
}
