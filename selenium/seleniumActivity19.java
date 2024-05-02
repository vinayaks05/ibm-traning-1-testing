import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class seleniumActivity19 {

    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");

        System.out.println(driver.getTitle());
        // find the conform button and click it
        WebElement confButton = driver.findElement(By.id("confirm"));

        confButton.click();

        // switch focus from main window to Alert box and read the text
        String message = driver.switchTo().alert().getText();
        System.out.println(message);
        wait.until(ExpectedConditions.alertIsPresent());
        //click on accept or ok button
        driver.switchTo().alert().accept();
        confButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        // then click on cancel button
        driver.switchTo().alert().dismiss();

        // close browser
        driver.close();
        /*
        driver.quit();
        */
    }
}
