import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        String url="https://www.google.com/";
        driver.get(url);
        driver.manage().window().maximize();
        String title= driver.getTitle();
        String myCurrentUrl=driver.getCurrentUrl();
        System.out.println(title+" "+myCurrentUrl);
        //driver.quit();
    } 
}
