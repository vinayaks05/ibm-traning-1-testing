

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class seleniumActivity6 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        Actions action = new Actions(driver);
        // Open the browser
        driver.get("https://v1.training-support.net/selenium/input-events");
        // get the title of the page
        System.out.println(driver.getTitle());
        action.keyDown(Keys.SHIFT).sendKeys("v").perform();
        action.keyUp(Keys.SHIFT).perform();
        action.keyDown(Keys.CONTROL).sendKeys("A").perform();
        action.keyUp(Keys.CONTROL).perform();
        action.keyDown(Keys.CONTROL).sendKeys("c").perform();
        action.keyUp(Keys.CONTROL).perform();

        // exit browser
        driver.quit();

    }
}
