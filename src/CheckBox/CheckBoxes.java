package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckBoxes {
    static String url="https://ebay.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement advancedButton=driver.findElement(By.xpath("//a[@id='gh-as-a']"));
        advancedButton.click();

        List<WebElement> allInputElements = driver.findElements(By.xpath("//*[@class='checkbox-set'][1]//*[@class='basic_aspect_chbx']"));
        System.out.println("RadioButtons"+allInputElements.size()+"\n");
        for (WebElement iteratingElement:allInputElements
             ) {
            iteratingElement.click();
            System.out.println(iteratingElement.getAttribute("name"));
            iteratingElement.click();
        }
        System.out.println("\nCheckboxes\n");
        List<WebElement> checkBoxesList = driver.findElements(By.xpath("//*[@class='checkbox-set'][4]//*[@type='checkbox']"));
        for (WebElement checkBoxes: checkBoxesList
             ) {
            System.out.println(checkBoxes.getAttribute("name"));
            checkBoxes.click();
        }

        System.out.println("\nDropdowns\n");
        //Single or multiple
        //How to Handle
        //1. click on the dropdown on the option
        //2. use select class-> must have select tag
            //- select options from dropdown can be done in 3 ways:
                //A. by index
                //B. by visible text
                // C. by value
        WebElement dropdown = driver.findElement(By.id("_salicSelect"));    //-> single select
        Select select=new Select(dropdown);
       // select.selectByIndex(47);     -> index
       // select.selectByVisibleText("Colombia");     -> visible text
       select.selectByValue("46"); // -> value
       
       //
        System.out.println("\ngetting from 40 to 47\n");
       // List<WebElement>allOptions = select.getOptions();
       // System.out.println(allOptions.size());

        for (int i=40;i<48;i++){
         //   System.out.print(allOptions.get(i).getText()+", ");         // -> tp print all the text




            select.selectByIndex(i);                                     // -> using select object to select by index
        }



    }

}
