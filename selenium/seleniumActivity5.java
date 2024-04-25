/*
* perform mouse click on the page
* print the number which appear on top to console
* */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class seleniumActivity5 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Actions action = new Actions(driver);
        // Open the browser
        driver.get("https://v1.training-support.net/selenium/input-events");
        // get the title of the page
        System.out.println(driver.getTitle());
        // get element to be clicked
        WebElement part = driver.findElement(By.id("wrapD3Cube"));

        // single click action
        new Actions(driver).click(part).pause(Duration.ofSeconds(2)).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // find the active element and print its value
        WebElement header = driver.findElement(By.className("active"));
        System.out.println(header.getText());

        // preform double click action
        new Actions(driver).doubleClick(part).pause(Duration.ofSeconds(2)).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // find the active header and print its value
        WebElement header2 = driver.findElement(By.className("active"));
        System.out.println(header2.getText());

        // perform right click action
        new Actions(driver).contextClick(part).pause(Duration.ofSeconds(2)).perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        // print its value
        WebElement header3 = driver.findElement(By.className("active"));
        System.out.println(header3.getText());

        // exit browser
        driver.quit();

    }
}
