// Checking the page title
//Header Tests:
//Find the third header and assert the text in the h3 tag.
//Find and assert the colour of the fifth header tag element.
//Button Tests:
//Find the button with the class olive and assert it text.
//Find and assert the colour of the first button in the third row.
//Group the Header tests under a group, HeaderTests.
//Group the Button tests under a group, ButtonTests

// everything under testfile2.xml

package suitExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
    static WebDriver driver;
    @BeforeClass(alwaysRun = true)
    public void beforeMethod(){
        // set firefox
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test(groups = { "header" })
    public void myHeaderTest1(){
        WebElement header3 = driver.findElement(By.id("third-header"));
        String h3text = header3.getText();
        Assert.assertEquals(h3text, "Third header");

    }
    @Test(groups = { "header" })
    public void myHeaderTest2(){
        WebElement header5 = driver.findElement(By.tagName("h5"));
        String h5text = header5.getCssValue("color");
        //System.out.println(h5text);
        Assert.assertEquals(h5text, "rgb(33, 186, 69)");
    }

    @Test(groups = { "button" })
    public void myButtonTest1(){
        WebElement olive = driver.findElement(By.cssSelector("button.olive"));
        String textOlive = olive.getText();
        //System.out.println(textOlive);
        Assert.assertEquals(textOlive, "Olive");
    }

    @Test(groups = { "button" })
    public void myButtonTest2(){
        WebElement button = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[1]"));
        String textButton = button.getCssValue("color");
        //System.out.println(textOlive);
        Assert.assertEquals(textButton, "rgb(255, 255, 255)");
    }

    @AfterClass(alwaysRun = true)
    public void afterTest(){
        // close browser
        driver.quit();
    }
}
