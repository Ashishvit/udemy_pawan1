package Selenium_11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Window_popUp
{
 public static void main(String args[])
 {

WebDriver driver = new ChromeDriver();

     driver.get("http://admin:admin@the-internet.herokuapp.com");// username:admin password : admin
     driver.findElement(By.xpath("//a[text()='Basic Auth']")).click();
 }
}
