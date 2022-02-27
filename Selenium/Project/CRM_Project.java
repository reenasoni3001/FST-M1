package Activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CRM_Project {
    private static final Duration Duration = null;
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("http://alchemy.hguy.co/crm");
    }
    @Test
    public void gettitle() {
        String title = driver.getTitle();
        System.out.println("Title is: " + title);
        Assert.assertEquals(title, "SuiteCRM");
    }
    @Test
    public void headerurl() {
        WebElement element=driver.findElement(By.cssSelector("img[src='themes/default/images/company_logo.png?v=cK7kLsY0ftg72ZVHTYUT_g']"));
        String url=element.getAttribute("src");
        System.out.println("headerurl is: " +url);
    }
    @Test
    public void copyrighttext() {
        String copytext = driver.findElement(By.id("admin_options")).getText();
        System.out.println("copyright text is: "+copytext);
    }
    @Test
    public void verifylogin() {
        driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("bigbutton")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String homepageurl = driver.getCurrentUrl();
        System.out.println("Title is: " + homepageurl);
        Assert.assertEquals(homepageurl, "https://alchemy.hguy.co/crm/index.php?module=Home&action=index");
        System.out.println("homepage is displayed");

    }
    @Test
    public void homepagenavigationmenucolor() {
        verifylogin();
        String navigationmenurColour = driver.findElement(By.xpath("//div[@id='toolbar']")).getCssValue("color");
        System.out.println("home pagetoolbar color is : " + navigationmenurColour);
    }

    @Test
    public void activitiesisdisplayed() {
        verifylogin();

        WebElement activities= driver.findElement(By.xpath("//a[@id='grouptab_3']"));

        System.out.println("activities is displayed in menu "+activities.isDisplayed());
    }

    @Test
    public void leadinfopopup() {
        verifylogin();
        WebElement sales =driver.findElement(By.xpath("//a[@id='grouptab_0']"));
        Actions builder = new Actions(driver);
        Action actionsToPerform = builder.moveToElement(sales).click()

                .build();
        actionsToPerform.perform();
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/span[2]/ul/li[5]/a")).click();

        WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[10]/span/span"))).click();

        String phoneno=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='bootstrap-container']/div[@id='content']/div[7]/div[2]/span"))).getText();

        System.out.println("phone no of lead1 is "+phoneno);
    }

    @Test
    public void accountpage() {
        verifylogin();
        WebElement sales =driver.findElement(By.xpath("//a[@id='grouptab_0']"));
        Actions builder = new Actions(driver);
        Action actionsToPerform = builder.moveToElement(sales).click()

                .build();
        actionsToPerform.perform();
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/span[2]/ul/li[2]/a")).click();

        WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(20));
        List<WebElement> listname= driver.findElements(By.xpath("//div[@class='listViewBody']/form[2]/div[3]/table/tbody/tr/td[3]/b/a"));

        wait.until(ExpectedConditions.visibilityOfAllElements(listname));
        System.out.println("first five odd row names are");

        for(int i=1;i<=9;i=i+2) {
            System.out.println(i+" row");
            System.out.println(driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr["+ i +"]/td[3]/b/a")).getText());
        }

    }
    @Test
    public void leadpagecol3andcol7() {
        verifylogin();
        WebElement sales =driver.findElement(By.xpath("//a[@id='grouptab_0']"));
        Actions builder = new Actions(driver);
        Action actionsToPerform = builder.moveToElement(sales).click()

                .build();
        actionsToPerform.perform();
        driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/span[2]/ul/li[5]/a")).click();
        WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(20));
        List<WebElement> listname= driver.findElements(By.xpath("//div[@class='listViewBody']/form[2]/div[3]/table/tbody/tr/td[3]/b/a"));

        wait.until(ExpectedConditions.visibilityOfAllElements(listname));
        System.out.println("first 10 row names are");
        for(int i=1; i<=10; i++){

            System.out.println(driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr["+ i +"]/td[3]/b/a")).getText());
        }
        System.out.println("first 10 row users are");
        for(int j=1; j<=10; j++){

            System.out.println(driver.findElement(By.xpath("//table[@class='list view table-responsive']//tr["+ j +"]/td[8]/a")).getText());
        }
    }

    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();

    }



}
