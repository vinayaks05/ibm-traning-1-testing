import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class seleniumActivity7 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        Actions action = new Actions(driver);
        // Open the browser
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        // get the title of the page
        System.out.println(driver.getTitle());

        // select the ball element
        WebElement ball= driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));

        // perform drag and drop
        action.dragAndDrop(ball, drop1).perform();
        WebElement dropzone1 = driver.findElement(By.id("droppable"));
        System.out.println(dropzone1.getText());

        // find second drop zone and drop it there
        WebElement drop2 = driver.findElement(By.id("dropzone2"));
        action.dragAndDrop(ball, drop2).perform();
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
        System.out.println(dropzone2.getText());
        //System.out.println(dropzone1);
        // exit browser
        driver.quit();

    }

}
