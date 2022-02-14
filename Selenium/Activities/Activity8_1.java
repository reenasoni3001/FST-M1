package Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



import java.util.List;

public class Activity8_1 {
    public static void main(String[] args) {
        //creating instance
        WebDriver driver = new FirefoxDriver();

        //open browser
        driver.get("https://training-support.net/selenium/tables");

        //columns
        //List<WebElement> columns = driver.findElements(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]"));
        //System.out.println("Number of columns are: " + columns.size());

        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        System.out.println("Number of columns are: " + cols.size());

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of rows are: " + rows.size());

        //print 3rd row value
        List<WebElement> thirdRow = driver.findElements(By.xpath("//*[@id='sortableTable']/tbody/tr[3]/td"));
        for( WebElement cellValue : thirdRow) {
            System.out.println(cellValue.getText());
        }


        //second row and second column
        WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value: " + cellValue2_2.getText());




        driver.close();


    }
}
