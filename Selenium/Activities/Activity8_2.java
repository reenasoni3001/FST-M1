package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
        //creating instance
        WebDriver driver = new FirefoxDriver();

        //open browser
        driver.get("https://training-support.net/selenium/tables");

        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        System.out.println("Number of columns are: " + cols.size());

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of rows are: " + rows.size());

        WebElement cellValue = driver.findElement(By.xpath("//*[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println(cellValue.getText());

        WebElement footer = driver.findElement(By.xpath("//*[@id='sortableTable']/tfoot"));
        System.out.println(footer.getText());

        driver.close();

    }
}
