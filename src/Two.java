import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Two {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        String url="https://facebook.com";
        driver.get(url);
        driver.manage().window().maximize();
        String emailID = "email";
        driver.findElement(By.id(emailID)).sendKeys("Juan@gmail.com");
        System.out.println(driver.getTitle());
    }
}
