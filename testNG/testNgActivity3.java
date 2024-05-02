import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNgActivity3 {
    WebDriver driver;
    @BeforeClass
    public void beforeDoSomething(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @Test
    public void myTest(){
        // using username and password login to page
        driver.findElement(By.name("Username")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("password");
        driver.findElement(By.xpath("//button[@class = 'ui button']")).click();
        // check the output is as expected
        String actual = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(actual, "Welcome Back, admin");
    }

    @AfterClass
    public void afterDoSomething(){
        //close browser
        driver.quit();
    }
}
