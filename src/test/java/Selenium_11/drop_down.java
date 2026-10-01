package Selenium_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class drop_down
{

    public static void main(String[] args) throws InterruptedException
    {

        WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();


        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(2000);

        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Thread.sleep(2000);

        Select select = new Select(dropdown);
        Thread.sleep(2000);
//Select select = new Select(dropdown)
        //select.selectByValue("abc")
        //abc.selectByIndex(2);
        select.selectByValue("option1");
        Thread.sleep(2000);

        String actualSelected = select.getFirstSelectedOption().getText();
        String expectedValue = "Option1";


        // Correct assertion
        Assert.assertEquals(actualSelected,expectedValue, "Dropdown selection does not match");
        //Assert.assertEquals(actualSelected, "Option1", "Dropdown selection does not match");
        System.out.println("✅ Dropdown verification passed!");

      //  driver.close();
        //Assert.assertEquals(act, exp "hello");
        //Assert.assertEquals(act, exp, "hello")

    }

}
