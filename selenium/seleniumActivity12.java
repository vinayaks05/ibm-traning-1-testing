import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class seleniumActivity12 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        // get the title of the page
        System.out.println(driver.getTitle());

        WebElement textbox = driver.findElement(By.xpath("//*[@id=\"input-text\"]"));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicText")));
        if (textbox.isEnabled()){
            System.out.println("Enabled");
        }
        else{
            System.out.println("Not enabled");
        }

        WebElement button = driver.findElement(By.id("toggleInput"));
        button.click();

        if (textbox.isEnabled()){
            System.out.println("Enabled");
        }
        else{
            System.out.println("Not enabled");
        }
        // exit browser
        driver.quit();
    }
}
