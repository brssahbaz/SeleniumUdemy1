import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        //WebElement fullName=driver.findElement(By.id("userName"));
        WebElement fullName=driver.findElement(By.cssSelector("#userName"));
        fullName.sendKeys("Barish");

        //WebElement email=driver.findElement(By.id("userEmail"));
        WebElement email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("shbz@gmail.com");

        WebElement currentAdress=driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
        currentAdress.sendKeys("ankara/Turkey");

        WebElement permanentAdress=driver.findElement(By.id("permanentAddress"));
        permanentAdress.sendKeys("meneviş");

      WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
        Thread.sleep(5000);
        submit.click();
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,450)","");




    }

}
