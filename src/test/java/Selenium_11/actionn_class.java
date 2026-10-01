package Selenium_11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import java.time.Duration;

public class actionn_class
{


    public static void main(String[] args) throws InterruptedException {

            // Setup driver
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();

            // Open test site
            driver.get("https://demoqa.com/buttons");

            // Create Actions object
            Actions actions = new Actions(driver);

            // 1. Click
            WebElement clickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
            actions.click(clickBtn).perform();

            // 2. Double Click
            WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
            actions.doubleClick(doubleClickBtn).perform();

            // 3. Right Click
            WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
            actions.contextClick(rightClickBtn).perform();

            // 4. Move to Element (Mouse Hover)
            driver.get("https://demoqa.com/menu");
            WebElement menu = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
            actions.moveToElement(menu).perform();

            // 5. Drag and Drop
            driver.get("https://demoqa.com/droppable");
            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));
            actions.dragAndDrop(source, target).perform();

            // 6. Click and Hold + Release
            actions.clickAndHold(source).pause(Duration.ofSeconds(2)).release(target).perform();

            // 7. Keyboard Actions (Typing)
            driver.get("https://demoqa.com/text-box");
            WebElement inputBox = driver.findElement(By.id("userName"));
            actions.sendKeys(inputBox, "Ashish Automation").perform();

            // 8. KeyDown + KeyUp (CTRL + A + C + V)
            actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
            WebElement emailBox = driver.findElement(By.id("userEmail"));
            actions.click(emailBox)
                    .keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
                    .perform();

            // 9. Special Keys (TAB, ENTER, ESC)
            actions.sendKeys(Keys.TAB).sendKeys("test@gmail.com").sendKeys(Keys.ENTER).perform();

            // 10. Pause between actions (simulate slow typing)
            actions.click(inputBox)
                    .pause(Duration.ofSeconds(1))
                    .sendKeys("S")
                    .pause(Duration.ofMillis(500))
                    .sendKeys("D")
                    .pause(Duration.ofMillis(500))
                    .sendKeys("E")
                    .perform();

            Thread.sleep(3000);
            driver.quit();
        }
    }


