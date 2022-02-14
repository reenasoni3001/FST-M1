package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.findElement(By.id(("prompt"))).click();

        //switch to alert window
        Alert promptAlert = driver.switchTo().alert();

        String text = promptAlert.getText();
        System.out.println(text);

        promptAlert.sendKeys("hello!");

        promptAlert.accept();
        //confirmAlert.dismiss();

        driver.close();
    }
}
