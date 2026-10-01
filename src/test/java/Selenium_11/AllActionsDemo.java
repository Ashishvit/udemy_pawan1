package Selenium_11;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class AllActionsDemo {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            Actions action = new Actions(driver);

            // ----------------------------------------------------
            // Mouse Hover
            // ----------------------------------------------------
            driver.get("https://demoqa.com/menu");

            WebElement mainItem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
            action.moveToElement(mainItem2).perform();

            Thread.sleep(2000);


            // ----------------------------------------------------
            // Right Click (Context Click)
            // ----------------------------------------------------
            driver.get("https://demoqa.com/buttons");

            WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
            action.contextClick(rightClickBtn).perform();

            Thread.sleep(2000);


            // ----------------------------------------------------
            // Double Click
            // ----------------------------------------------------
            WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
            action.doubleClick(doubleClickBtn).perform();

            Thread.sleep(2000);


            // ----------------------------------------------------
            // Drag and Drop
            // ----------------------------------------------------
            driver.get("https://demoqa.com/droppable");

            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));

            action.dragAndDrop(source, target).perform();

            Thread.sleep(2000);


            // ----------------------------------------------------
            // Click and Hold
            // ----------------------------------------------------
            action.clickAndHold(source).perform();
            Thread.sleep(2000);
            action.release().perform();

            Thread.sleep(2000);


            // ----------------------------------------------------
            // Drag and Drop By (X,Y Coordinates)
            // ----------------------------------------------------
            action.dragAndDropBy(source, 150, 50).perform();

            Thread.sleep(2000);


            // ----------------------------------------------------
            // Move By Offset
            // ----------------------------------------------------
            action.moveByOffset(100, 100).click().perform();

            Thread.sleep(2000);


            // ----------------------------------------------------
            // Normal Click using Actions class
            // ----------------------------------------------------
            driver.get("https://demoqa.com/buttons");

            WebElement clickMe = driver.findElement(By.xpath("(//button[text()='Click Me'])[3]"));

            action.click(clickMe).perform();

            Thread.sleep(2000);


            // ----------------------------------------------------
            // Send Keys using Actions class
            // ----------------------------------------------------
            driver.get("https://demoqa.com/text-box");

            WebElement fullName = driver.findElement(By.id("userName"));

            action.sendKeys(fullName, "Ashish Sharma").perform();

            Thread.sleep(2000);


            // ----------------------------------------------------
            // Keyboard Actions
            // ----------------------------------------------------

            // CTRL + A
            action.keyDown(Keys.CONTROL)
                    .sendKeys("a")
                    .keyUp(Keys.CONTROL)
                    .perform();

            Thread.sleep(1000);

            // CTRL + C
            action.keyDown(Keys.CONTROL)
                    .sendKeys("c")
                    .keyUp(Keys.CONTROL)
                    .perform();

            Thread.sleep(1000);

            // TAB key
            action.sendKeys(Keys.TAB).perform();

            Thread.sleep(1000);

            // CTRL + V
            action.keyDown(Keys.CONTROL)
                    .sendKeys("v")
                    .keyUp(Keys.CONTROL)
                    .perform();

            Thread.sleep(1000);


            // ----------------------------------------------------
            // Build and Perform Example
            // ----------------------------------------------------
            action.moveToElement(fullName)
                    .click()
                    .sendKeys(" Selenium")
                    .build()
                    .perform();


            Thread.sleep(3000);

            driver.quit();
        }
    }

