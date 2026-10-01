package Selenium_11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Relative_Locator_feature_Seelnium4
{
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        // Open Google URL
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // Optional: Maximize the window
        driver.manage().window().maximize();
        //WebElement nameText = driver.findElement(By.xpath("(//input[@name=\"name\"])[1]"));

        //WebElement elementAbove = driver.findElement(with(By.tagName("label")).above(nameText));
       // System.out.println("test of above element : " + elementAbove.getText());

        //WebElement DOB = driver.findElement(By.xpath(""));
        //WebElement elementBelow = driver.findElement(with(By.xpath("//input[@name=\"bday\"]")).below(DOB));
        //System.out.println("below text   :"+elementBelow.getText());

        WebElement icecreamlabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.xpath("//input[@id=\"exampleCheck1\"]")).toLeftOf(icecreamlabel)).click();



      //driver.close();



    }
}
