import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNgActivity1 {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod(){
        // Set firefox driver
        WebDriverManager.firefoxdriver().setup();
        // create new firefox
        driver = new FirefoxDriver();
        // open browser
        driver.get("https://v1.training-support.net");

    }

    @Test
    public void myTestCode(){
        // Check the title of the page
        String title = driver.getTitle();

        //Print the title of the page
        System.out.println("Page title is: " + title);

        //Assertion for page title
        Assert.assertEquals("Training Support", title);

        //Find the clickable link on the page and click it
        driver.findElement(By.id("about-link")).click();

        //Print title of new page
        System.out.println("New page title is: " + driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }

    @AfterClass
    public void afterMethod(){
        // driver quit
        driver.quit();
    }
}
