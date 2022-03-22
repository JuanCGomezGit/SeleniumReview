import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ElementCommands
{
    static String url="http://ebay.com";
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("The number of links in the page is: " + allLinks.size());
        for (WebElement link :allLinks)
        {
            String name = link.getText();
            if (!name.isEmpty())   // To filter links without text
            {
                if (name.equalsIgnoreCase("Electronics"))
                {
                    System.out.println("This is the link for Electronics " + link.getAttribute("href"));// prints the value of href -> link
                    link.click();
                }
            }
        }
    }
}
