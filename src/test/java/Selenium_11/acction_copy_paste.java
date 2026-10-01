package Selenium_11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
public class acction_copy_paste {

    public static void main(String[] args) throws InterruptedException {
        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open a sample page with two textboxes
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");

        // Switch to iframe (because W3Schools runs inside iframe)
        driver.switchTo().frame("iframeResult");

        // Locate the first textbox
        WebElement input1 = driver.findElement(By.name("fname"));
        input1.sendKeys("Hello World");

        // Create Actions object
        Actions action = new Actions(driver);

        // Step 1: Select All (CTRL + A)
        action.click(input1)
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .perform();

        // Step 2: Copy (CTRL + C)
        action.keyDown(Keys.CONTROL)
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .perform();

        // Locate the second textbox
        WebElement input2 = driver.findElement(By.name("lname"));

        // Step 3: Paste (CTRL + V)
        action.click(input2)
                .keyDown(Keys.CONTROL)
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .perform();

        // Wait to see result
        Thread.sleep(3000);

        driver.quit();
    }
}
