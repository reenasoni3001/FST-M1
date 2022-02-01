package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        //open the browser
        driver.get("https://github.com/mozilla/geckodriver/releases");
        driver.close();
    }
}
