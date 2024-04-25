// check if the checkbox is clicked


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class seleniumActivity11 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        // get the title of the page
        System.out.println(driver.getTitle());

        WebElement checkbox = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/input"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicCheckbox")));
        if (checkbox.isSelected()){
            System.out.println("Selected");
        }
        else{
            System.out.println("Not selected");
        }

        checkbox.click();

        if (!checkbox.isSelected()){
            System.out.println("Not selected");
        }
        else{
            System.out.println("Selected");
        }

        // exit browser
        driver.quit();
    }

}
