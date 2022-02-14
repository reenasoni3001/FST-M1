package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/selects ");

       WebElement selected = driver.findElement(By.id("single-value"));

       Select dropdown = new Select(driver.findElement(By.id("single-select")));

       //Select the second option using selectByVisibleText()
        dropdown.selectByVisibleText("Option 2");
        System.out.println(selected.getText());

        //Select the third option using selectByIndex()
        dropdown.selectByIndex(3);
        System.out.println(selected.getText());

        //Select the fourth option using selectByValue()
        dropdown.selectByValue("4");
        System.out.println(selected.getText());

        //Finally, get all the options in the dropdown and print them one by one
        List<WebElement> options = dropdown.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        driver.close();







    }
}
