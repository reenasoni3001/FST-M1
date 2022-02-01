package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {
        //creating intance
        WebDriver driver = new FirefoxDriver();
        //open browser
        driver.get("https://www.training-support.net/selenium/target-practice");

        //pint the page title
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        //third header
        String third = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println(third);

        //fifth header
        String fifth = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5")).getCssValue("color");
        System.out.println(fifth);

        //voilet button
        String voilet = driver.findElement(By.xpath("//*[@id='purple-button']")).getText();
        System.out.println(voilet);

        //grey button
        String grey = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println(grey);

        driver.close();









    }
}
