package Selenium_11;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAllMethods {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");


            //========================================================
            // switchTo().alert() + getText() + accept()
            //========================================================

            driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

            Alert simpleAlert = driver.switchTo().alert();

            System.out.println(simpleAlert.getText());

            simpleAlert.accept();


            //========================================================
            // switchTo().alert() + getText() + dismiss()
            //========================================================

            driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

            Alert confirmAlert = driver.switchTo().alert();

            System.out.println(confirmAlert.getText());

            confirmAlert.dismiss();


            //========================================================
            // switchTo().alert() + sendKeys() + accept()
            //========================================================

            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

            Alert promptAlert = driver.switchTo().alert();

            System.out.println(promptAlert.getText());

            promptAlert.sendKeys("Ashish");

            promptAlert.accept();


            //========================================================
            // Prompt Alert + dismiss()
            //========================================================

            driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

            Alert promptAlert2 = driver.switchTo().alert();

            promptAlert2.dismiss();


            driver.quit();

        }
    }

