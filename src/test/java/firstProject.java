import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class firstProject {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.manage().window().maximize();

        WebElement elements=driver.findElement(By.xpath("//h5[1]"));
        elements.click();

        WebElement webtables=driver.findElement(By.xpath("(//span[@class='text'])[4]"));
        webtables.click();

        WebElement addButton=driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

        Actions action=new Actions(driver);
        WebElement firstName=driver.findElement(By.id("firstName"));


        action.sendKeys(Keys.TAB);









    }
}
