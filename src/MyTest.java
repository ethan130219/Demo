import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 public class MyTest {
        public static void main(String[] args) throws InterruptedException {

//            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//            WebDriver driver = new ChromeDriver();
//            driver.navigate().to("https://www.google.com");
//            driver.get("https://www.uber.com/");
//            System.out.println(driver.getTitle());
//            driver.navigate().back();
//            System.out.println(driver.getCurrentUrl());
//            driver.manage().window().maximize();
//            driver.close();
            //---------------------------------------------------------
//            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//            WebDriver driver = new ChromeDriver();
//            driver.navigate().to("https://www.senecacollege.ca/");
//            driver.manage().window().maximize();
//            driver.navigate().to("https://humber.ca/");
//            driver.navigate().to("https://www.georgebrown.ca/");
//            driver.navigate().to("https://www.utoronto.ca/");
//          System.out.println(driver.getTitle());
//           driver.navigate().back();
//            System.out.println(driver.getTitle());
//            driver.navigate().back();
//            System.out.println(driver.getCurrentUrl());
//            driver.navigate().back();
//            System.out.println(driver.getTitle());
//            driver.close();


            //-----------------------------------------------

//            System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
//            ChromeDriver driver = new ChromeDriver();
//            driver.get("https://testautomationpractice.blogspot.com/");

//            WebElement element1= driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[2]"));
//            System.out.println("The author name is: " + element1.getText());
//            WebElement element2=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[3]/td[2]"));
//            System.out.println("The author name is: " + element2.getText());
//            WebElement element3=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[4]/td[2]"));
//            System.out.println("The author name is: " + element3.getText());
//            WebElement element4=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[2]"));
//            System.out.println("The author name is: " + element4.getText());
//            WebElement element5=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[6]/td[2]"));
//            System.out.println("The author name is: " + element5.getText());
//            WebElement element6 = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[7]/td[2]"));
//            System.out.println("The author name is: " + element6.getText());


            //----------------------------------------
            System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("http://demo.guru99.com/test/newtours/");

            WebElement userName = driver.findElement(By.name("userName"));
            userName.sendKeys("ehtiram2022");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("yollacademy2022");

            WebElement login= driver.findElement(By.name("submit"));
            login.click();
            WebElement vocations = driver.findElement(By.partialLinkText("Vacati"));
            vocations.click();
            WebElement register= driver.findElement(By.linkText("REGISTER"));
            register.click();
            driver.close();

//-----------------------------------------------------------------------------
//            System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
//            ChromeDriver driver = new ChromeDriver();
//            driver.get("http://demo.guru99.com/test/newtours/");
//
//            WebElement register = driver.findElement(By.linkText("REGISTER"));
//            register.click();
//            WebElement firstName= driver.findElement(By.name("firstName"));=
//            firstName.sendKeys("Ehtiram");
//
//            WebElement lastName= driver.findElement(By.name("lastName"));
//            lastName.sendKeys("Islamov");
//
//            WebElement phone = driver.findElement(By.name("phone"));
//            phone.sendKeys("4372441319");
//            Thread.sleep(2000);
//            WebElement email = driver.findElement(By.name("userName"));
//            email.sendKeys("egesara92@gmail.com");
//            Thread.sleep(2000);
//            WebElement adress= driver.findElement(By.name("address1"));
//            adress.sendKeys("10 markbrook");
//            Thread.sleep(2000);
//            WebElement city = driver.findElement(By.name("city"));
//            city.sendKeys("Toronto");
//            Thread.sleep(2000);
//            WebElement province = driver.findElement(By.name("state"));
//            province.sendKeys("Ontario");
//            Thread.sleep(2000);
//            WebElement postal= driver.findElement(By.name("postalCode"));
//            postal.sendKeys("M9V5E3");
//            Thread.sleep(2000);
//            WebElement country= driver.findElement(By.name("country"));
//            country.click();
//            WebElement choosecountry= driver.findElement(By.xpath("//*[@value='CANADA']"));
//            choosecountry.click();
//            Thread.sleep(2000);
//            WebElement username= driver.findElement(By.xpath("//*[@id='email']"));
//            username.sendKeys("egesara92@gmail.com");
//            WebElement password = driver.findElement(By.name("password"));
//            password.sendKeys("ehtiram2022");
//            WebElement confirmpassword= driver.findElement(By.name("confirmPassword"));
//            confirmpassword.sendKeys("ehtiram2022");
//            WebElement submit= driver.findElement(By.name("submit"));
//            submit.click();
//driver.close();


            
}
}




