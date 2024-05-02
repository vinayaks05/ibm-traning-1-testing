import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
import org.openqa.selenium.support.ui.Select;



public class seleniumActivity17 {

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");
        System.out.println(driver.getTitle());

        WebElement list = driver.findElement(By.id("single-select"));
        Select select = new Select(list);

        select.selectByVisibleText("Option 2");
        System.out.println(driver.findElement(By.id("single-value")).getText());

        select.selectByIndex(3);
        System.out.println(driver.findElement(By.id("single-value")).getText());


        select.selectByValue("4");
        System.out.println(driver.findElement(By.id("single-value")).getText());

        List<WebElement> allOptions = select.getOptions();

        for (WebElement options: allOptions){
            System.out.println(options.getText());
        }

        //close browser
        driver.quit();

    }
}
