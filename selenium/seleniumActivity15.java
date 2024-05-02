import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class seleniumActivity15 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        Actions action = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

        System.out.println(driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // username to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder = 'Username']")));
        // password to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder = 'Password']")));

        WebElement user = driver.findElement(By.xpath("//input[@placeholder = 'Username']"));
        user.click();
        action.sendKeys("admin").perform();

        WebElement password = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
        password.click();
        action.sendKeys("password").perform();

        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[1]/div/div/button"));
        login.click();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"action-confirmation\"]"), "Welcome Back, admin"));
        WebElement logmsg = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        System.out.println("Login Message: "+logmsg.getText());

        //close browser
        driver.quit();



    }
}
