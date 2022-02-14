package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");

        //click the simple alert
        driver.findElement(By.id("simple")).click();

        //Switch to alert box
        Alert simpleAlert = driver.switchTo().alert();

        //Get the text of the alert box
        String text = simpleAlert.getText();
        System.out.println(text);

        //close the alert
        simpleAlert.accept();
        driver.close();



    }

}
