import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class seleniumActivity9 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Actions action = new Actions(driver);
        // Open the browser
        driver.get("https://v1.training-support.net/selenium/ajax");
        // get the title of the page
        System.out.println(driver.getTitle());
        WebElement button = driver.findElement(By.cssSelector(".ui.violet.button"));
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        WebElement h1 = driver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late!"));
        WebElement h3 = driver.findElement(By.tagName("h3"));
        System.out.println(h3.getText());

        // exit browser
        driver.quit();

    }

}
