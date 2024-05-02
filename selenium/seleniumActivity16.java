// done entirely with absolute xpath

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class seleniumActivity16 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        Actions action = new Actions(driver);

        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

        System.out.println(driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // username to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[1]/input")));
        // password to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/input")));

        WebElement user = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[1]/input"));
        user.click();
        action.sendKeys("admin").perform();

        WebElement password = driver.findElement(By.xpath("//html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[2]/input"));
        password.click();
        action.sendKeys("password").perform();

        WebElement password2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[3]/input"));
        password2.click();
        action.sendKeys("password").perform();

        WebElement email = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/div[4]/input"));
        email.click();
        action.sendKeys("email@email.com").perform();


        WebElement signin = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button"));
        signin.click();

        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"action-confirmation\"]"), "Thank you for registering, admin"));
        WebElement logmsg = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        System.out.println("Login Message: " + logmsg.getText());

        //close browser
        driver.quit();
    }
}
