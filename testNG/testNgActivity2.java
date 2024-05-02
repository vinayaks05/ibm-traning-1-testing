import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testNgActivity2 {
    WebDriver driver;
    @BeforeClass
    public void beforeMethod(){
        // set firefox
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }
    @Test
    public void firstTest(){
        // get title and assert it this should pass
        String title = driver.getTitle();
        Assert.assertEquals(title, "Target Practice");
    }

    @Test
    public void secondTest(){
        // get an element and assert it wrongly this should fail
        WebElement button = driver.findElement(By.cssSelector(".ui.black.button"));
        String buttonText = button.getText();
        Assert.assertEquals(buttonText, "blue");
    }
    // Skip using enable false
    @Test(enabled = false)
    public void thirdTest(){
        System.out.println("Third test");
    }
    // skip using skip exception
    // use throws SkipException to document as a method signature
    @Test
    public void fourthTest() throws SkipException{
        System.out.println("Skip test case 4");
        throw new SkipException("Fourth Skipped");
        // when throwing skip exception throw should be on the
        // top of all the test code.
        // use some condition for the skip exception
        //WebElement button = driver.findElement(By.cssSelector(".Button"));

    }

    @AfterClass
    public void afterMethod(){
        // close browser
        driver.quit();
    }

}
