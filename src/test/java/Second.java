import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Second {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //Timeouts
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //Window
        driver.manage().window().maximize();
       int x= driver.manage().window().getPosition().getX();
       int y= driver.manage().window().getPosition().getY();

       //URL
        driver.get("https://www.matzade.com");
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        String currentTitle=driver.getTitle();
        System.out.println(currentTitle);
        String pageSource=driver.getPageSource();
        //System.out.println(pageSource);

        //Navigate
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



    }
}
