package Activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.findElement(By.id(("confirm"))).click();

        //switch to alert window
        Alert confirmAlert = driver.switchTo().alert();

        String text = confirmAlert.getText();
        System.out.println(text);

        confirmAlert.accept();
        //confirmAlert.dismiss();

        driver.close();



    }

}
