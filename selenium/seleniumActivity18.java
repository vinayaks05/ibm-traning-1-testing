// On the Multi Select:
// Select the "JavaScript" option using the visible text.
// Select the 4th, 5th, 6th options using the index.
// Select the "NodeJS" option using the value.
// Deselect the 5th option using index.
// Close the browser.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;


public class seleniumActivity18 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(driver.getTitle());

        WebElement list = driver.findElement(By.id("multi-select"));
        Select select = new Select(list);

        select.selectByVisibleText("Javascript");
        // select multiple by the index value
        select.selectByIndex(4);
        select.selectByIndex(5);
        select.selectByIndex(6);
        // select nodejs
        select.selectByValue("node");
        //deselect 5th
        select.deselectByIndex(5);
        //close browser
        driver.quit();

    }
}
