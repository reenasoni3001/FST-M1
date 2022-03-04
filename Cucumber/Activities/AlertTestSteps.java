package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTestSteps {

    WebDriver driver;
    WebDriverWait wait;
    Alert alert;

    @Given("^ User is on Alert page $")
    public void loginAlertPage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @When("^ User clicks the Simple Alert button $")
    public void openSimpleAlert()
    {
        driver.findElement(By.cssSelector("#simple")).click();
        wait = new WebDriverWait(driver, 10);
    }

    @When("^ User clicks the Confirm Alert button $")
    public void openConfirmAlert()
    {
        driver.findElement(By.cssSelector("#confirm")).click();
        wait = new WebDriverWait(driver, 10);
    }

    @When("^ User clicks the Prompt Alert button $")
    public void openPromptAlert()
    {
        driver.findElement(By.cssSelector("#simple")).click();
        wait = new WebDriverWait(driver, 10);
    }

    @Then("^ Alert opens $")
    public void switchAlert() {
        alert = driver.switchTo().alert();
    }

    @And("^ Read the text from it and print it $")
    public void readAndPrintText() {
        String alertText = alert.getText();
        System.out.println("Alert Message: "+alertText);
    }

    @And("^ Close the alert $")
    public void acceptAlert() {
        alert.accept();
        System.out.println("Alert Accepted and Closed.");
    }

    @And("^ Close the alert with Cancel $")
    public void dismissAlert() {
        alert.dismiss();
        System.out.println("Alert Dismissed and Closed.");
    }

    @And("^ Write a custom message in it $")
    public void customMsgAlert() {
        alert.sendKeys("Writting Custom Message..");
        System.out.println("Custom Message Alert");
    }


    @And("^ Close browser $")
    public void closeBrowser() {
        driver.close();
    }

}
