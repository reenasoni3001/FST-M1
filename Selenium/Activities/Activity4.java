package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        //title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //click the about us link
        driver.findElement(By.xpath("//a[@id='about-link']")).click();

        //close the app
        driver.close();

    }
}
