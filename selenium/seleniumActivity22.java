import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class seleniumActivity22 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        Actions action = new Actions(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/popups");

        System.out.println(driver.getTitle());

        WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/button"));
        action.moveToElement(button).perform();
        String tooltipText = button.getAttribute("data-tooltip");
        System.out.println("Tooltip message: "+tooltipText);

        action.click(button).perform();
        //driver.switchTo().alert();
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
        username.sendKeys("admin");
        password.sendKeys("password");

        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();

        WebElement heading = driver.findElement(By.id("action-confirmation"));
        System.out.println(heading.getText());
        driver.quit();

    }
}
