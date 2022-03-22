import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class SyntaxHrPage {
    static String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
    static String username="Admin";
    static String password="Hum@nhrm123";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement userNameTextBox=driver.findElement(By.xpath("//*[@id='txtUsername']"));
        userNameTextBox.sendKeys(username);
        WebElement passwordTextBox=driver.findElement(By.xpath("//*[@id='txtPassword']"));
        passwordTextBox.sendKeys(password);
        WebElement btnLogin=driver.findElement(By.xpath("//*[@id='btnLogin']"));
        btnLogin.click();


    }
}
