import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;


public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/jQuery-Multiple-Select-Plugin-For-Bootstrap-Bootstrap-Multiselect/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@title='None selected'])[1]")).click();
        List<WebElement> skillsList =  driver.findElements(By.xpath("(//button[@title='None selected'])[1]/../ul/li"));
        String [] mySkills = {"C++", "LISP"};

        for(WebElement items : skillsList){

            String itemText = items.getText();

            for( String skill: mySkills){

                if (itemText.equalsIgnoreCase(skill)) {
                    items.click();
                    break;
                }
            }
        }


    }


}
