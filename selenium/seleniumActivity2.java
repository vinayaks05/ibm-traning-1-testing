import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import javax.swing.*;

public class seleniumActivity2 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");

        System.out.println(driver.getTitle());
        WebElement username = driver.findElement(By.name("Username"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("password");
        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div/button"));
        login.click();
        driver.quit();

    }
}
