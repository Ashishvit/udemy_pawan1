package Selenium_11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllFrameDemoMethods {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://demo.automationtesting.in/Frames.html");


            //=================================================
            // 1. Switch to Frame using Index
            //=================================================

            driver.switchTo().frame(0);

            driver.findElement(By.xpath("//input[@type='text']"))
                    .sendKeys("Frame using Index");

            // Come back to main page
            driver.switchTo().defaultContent();



            //=================================================
            // 2. Switch to Frame using WebElement
            //=================================================

            WebElement frameElement =
                    driver.findElement(By.id("singleframe"));

            driver.switchTo().frame(frameElement);

            driver.findElement(By.xpath("//input[@type='text']"))
                    .clear();

            driver.findElement(By.xpath("//input[@type='text']"))
                    .sendKeys("Frame using WebElement");

            driver.switchTo().defaultContent();



            //=================================================
            // 3. Switch to Nested Frames
            //=================================================

            driver.findElement(
                            By.linkText("Iframe with in an Iframe"))
                    .click();


            // Outer Frame
            WebElement outerFrame =
                    driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));

            driver.switchTo().frame(outerFrame);


            // Inner Frame
            WebElement innerFrame =
                    driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));

            driver.switchTo().frame(innerFrame);


            driver.findElement(By.xpath("//input[@type='text']"))
                    .sendKeys("Nested Frame");


            //=================================================
            // 4. parentFrame()
            //=================================================

            // Move from inner frame to outer frame
            driver.switchTo().parentFrame();



            //=================================================
            // 5. defaultContent()
            //=================================================

            // Move from any frame to main page
            driver.switchTo().defaultContent();



            //=================================================
            // 6. Switch to Frame using Name or ID
            //=================================================
            // Example:
            //
            // driver.switchTo().frame("frameName");
            //
            // or
            //
            // driver.switchTo().frame("frameID");
            //
            // This website does not contain frame name/id,
            // so only syntax is shown.
            //=================================================



            Thread.sleep(2000);

            driver.quit();

        }
    }

