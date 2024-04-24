/*
* open the link in browser
* get title of the page
* using x path
* find the 3rd header and print its text to console
* find the 5th header and print its colour
* using any other locator find:
* find violet button and print all its classes
* find grey button and print its text
* close browser
* */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumActivity4 {
    public static void main(String[] args) {

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");

        System.out.println(driver.getTitle());

        WebElement header3 = driver.findElement(By.xpath("//*[@id=\"third-header\"]"));
        System.out.println(header3.getText());
        WebElement header5 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));
        System.out.println(header5.getCssValue("color"));
        WebElement violetButton = driver.findElement(By.cssSelector(".ui.violet.button"));
        System.out.println(violetButton.getAttribute("class"));
        WebElement greyButton = driver.findElement(By.cssSelector(".ui.grey.button"));
        System.out.println(greyButton.getText());
        driver.quit();
    }
}
