/*
* open link in new browser
* get title of the page and print it to console
* fond about us using id
* click on the button
* get title of the new page and print it to console
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SeleniumActivity1 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
         driver.get("https://v1.training-support.net");

        // Perform testing and assertions
        System.out.println(driver.getTitle());
        WebElement input = driver.findElement(By.id("about-link"));
        input.click();
        System.out.println(driver.getTitle());

        // Close the browser
        // Feel free to comment out the line below
        // so it doesn't close too quickly
        driver.quit();
    }
}
