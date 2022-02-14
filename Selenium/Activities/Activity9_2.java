package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/selects ");

        WebElement chosen = driver.findElement(By.id("multi-value"));

        //select all elements inside multi select
        Select elements = new Select(driver.findElement(By.id("multi-select")));

        if (elements.isMultiple()) {
            //Select the 'JavaScript' option by visible text.
            elements.selectByVisibleText("Javascript");
            System.out.println(chosen.getText());

            //Select the 'NodeJS' option by value.
            elements.selectByValue("node");
            System.out.println(chosen.getText());

            //Select the 4th, 5th, and the 6th options by index.
            for(int i=4; i<=6; i++) {
                elements.selectByIndex(i);


            }
            System.out.println(chosen.getText());

            //Deselect the 7th option by index.

            elements.deselectByIndex(7);
            System.out.println(chosen.getText());



            //Print all selected options one by one and deselect all options.
            List<WebElement> selectAll = elements.getAllSelectedOptions();
            for(WebElement selectedOption : selectAll) {
                System.out.println(selectedOption.getText());
            }

            elements.deselectAll();
            System.out.println(chosen.getText());


        }
        driver.close();


    }
}
