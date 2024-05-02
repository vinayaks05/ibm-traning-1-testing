import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class seleniumActivity21 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/tab-opener");

        System.out.println(driver.getTitle());

        WebElement button = driver.findElement(By.id("launcher"));
        button.click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        String windows = driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()){
            System.out.println(windowHandle);
            driver.switchTo().window(windowHandle); // switch to the last window
        }

        wait.until(ExpectedConditions.elementToBeClickable(By.id("actionButton")));
        WebElement button2 = driver.findElement(By.id("actionButton"));
        button2.click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        for (String windowHandle : driver.getWindowHandles()){
            System.out.println(windowHandle);
            driver.switchTo().window(windowHandle); // switch to the last window
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));
        WebElement header = driver.findElement(By.className("content"));
        System.out.println(header.getText());

        //
        driver.quit();

    }
}
