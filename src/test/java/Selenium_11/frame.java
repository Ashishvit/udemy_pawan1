package Selenium_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frame
{
    public static void main(String[] args) {
        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open URL
        driver.get("http://jqueryui.com/droppable/");

        // Count iframes on the page
        System.out.println("Total iframes on page: " + driver.findElements(By.tagName("iframe")).size());

        // Switch to the first (and only) frame
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

        // Perform drag and drop
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        a.dragAndDrop(source, target).perform();

        // Switch back to main page
        driver.switchTo().defaultContent();
        driver.quit();
    }
}
