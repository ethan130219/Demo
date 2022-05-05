import io.opentelemetry.exporter.logging.SystemOutLogExporter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class task1 {
    public static void main(String[] args) throws InterruptedException {


//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.guru99.com/test/newtours/register.php");
//
//        String a= driver.findElement(By.name("firstName")).getAttribute("maxlength");
//        System.out.println("max value of first name is: "+a);
//        String b= driver.findElement(By.name("lastName")).getAttribute("maxlength");
//        System.out.println("max value of last name is: "+b);
//        String c= driver.findElement(By.name("userName")).getAttribute("maxlength");
//        System.out.println("max value of email is: "+c);
//        String d= driver.findElement(By.name("phone")).getAttribute("maxlength");
//        System.out.println("max value of phone is: "+d);
//        String e= driver.findElement(By.name("address1")).getAttribute("maxlength");
//        System.out.println("max value of address is: "+e);
//        String f= driver.findElement(By.name("city")).getAttribute("maxlength");
//        System.out.println("max value of city is: "+f);
//        String g= driver.findElement(By.name("postalCode")).getAttribute("maxlength");
//        System.out.println("max value of postal code is: "+g);
//
//
//
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://haltersweb.github.io/Accessibility/submit-disabling.html");
//String a= driver.findElement(By.xpath("//*[@type='submit']")).getAttribute("aria-disabled");
//        System.out.println(a);
//WebElement firstName= driver.findElement(By.name("firstName"));
//firstName.sendKeys("Fatih");
//WebElement lastName= driver.findElement(By.name("lastName"));
//lastName.sendKeys("Nicat");
//String isEnabled = driver.findElement(By.xpath("//*[@type='submit']")).getAttribute("aria-disabled");
//        System.out.println("submit button is enabled "+isEnabled);
//


//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://demo.automationtesting.in/Register.html");
//        WebElement firstName= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
//
//        firstName.sendKeys("Ehtiram");
//        WebElement lastName= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
//        lastName.sendKeys(Keys.SHIFT,"Islamov");
//        for( int i=0; i< myName.length()-1; i++){
//            firstName.sendKeys(Keys.BACK_SPACE);
//            Thread.sleep(2000);
//        }

//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//       WebDriver driver = new ChromeDriver();
//        driver.get("http://demo.automationtesting.in/Register.html");
//        WebElement year = driver.findElement(By.xpath("//select[@placeholder='Year']"));
//        Select optionsyear = new Select(year);
//        List<WebElement> options = optionsyear.getOptions();
//        for( WebElement a : options){
//            String b= a.getText();
//            System.out.println(b);
//        }
//        optionsyear.selectByVisibleText("2015");
//


//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//       WebDriver driver = new ChromeDriver();
//        driver.get("http://dev-hrm.yoll.io/");
//
//         WebElement a= driver.findElement(By.cssSelector("input#txtUsername"));
//         a.sendKeys("yoll-student");
//         WebElement b= driver.findElement(By.cssSelector("input#txtPassword"));
//         b.sendKeys("Bootcamp5#");
//        WebElement clicking = driver.findElement(By.cssSelector("input#btnLogin"));
//        clicking.click();
//        System.out.println(driver.getTitle());
//WebElement dash= driver.findElement(By.cssSelector(".head>h1"));
//        System.out.println(dash.getText());


//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.jqueryscript.net/demo/jQuery-Multiple-Select-Plugin-For-Bootstrap-Bootstrap-Multiselect/");
//        driver.findElement(By.xpath("(//button[@title='None selected'])[1]")).click();
//       driver.findElement(By.xpath("(//button[@title='None selected'])[1]/../ul/li[3]//input[@value='Python']")).click();
//
//
//         driver.findElement(By.xpath("(//button[@title='Python'])[1]/../ul/li[7]//input[@value='Ruby']")).click();


        System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/jQuery-Multiple-Select-Plugin-For-Bootstrap-Bootstrap-Multiselect/");
        Thread.sleep(2000);

        /* click on the dropdown */
        WebElement progLangDropdown = driver.findElement(By.xpath("(//button[@title='None selected'])[1]"));
        progLangDropdown.click();
        Thread.sleep(2000);

        /* List of elements in the dropdown */
        List<WebElement> progLangDropdownOptionsFromUI = driver.findElements(By.xpath("(//button[@title='None selected'])[1]/../ul/li"));
        String[] myProgLanguagesFromTestData = {"Python", "Ruby"};


        for (WebElement programLangFromUI : progLangDropdownOptionsFromUI) {
            String programLangValue = programLangFromUI.getText();




            for (String myProgLanguageFromTestData : myProgLanguagesFromTestData) {
                if (programLangValue.equals(myProgLanguageFromTestData)) {
                    programLangFromUI.click();
                    break;
             }


          }
        }
    }}