package Selenium_11;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            Thread.sleep(3000);

            // Type casting
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Get Page Title
            String title = (String) js.executeScript("return document.title;");
            System.out.println("Page Title : " + title);

            // Login
            WebElement username = driver.findElement(By.name("username"));
            username.sendKeys("Admin");

            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("admin123");

            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            // Click using JavaScriptExecutor
            js.executeScript("arguments[0].click();", loginButton);

            Thread.sleep(5000);

            // Scroll Down
            js.executeScript("window.scrollBy(0,500);");

            Thread.sleep(2000);

            // Scroll Up
            js.executeScript("window.scrollBy(0,-500);");

            Thread.sleep(2000);

            // Scroll to Bottom of Page
            js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

            Thread.sleep(2000);

            // Scroll to Top of Page
            js.executeScript("window.scrollTo(0,0);");

            Thread.sleep(2000);

            // Locate an element
            WebElement myInfo = driver.findElement(By.xpath("//span[text()='My Info']"));

            // Scroll Into View
            js.executeScript("arguments[0].scrollIntoView(true);", myInfo);

            Thread.sleep(2000);

            // Highlight Element
            js.executeScript(
                    "arguments[0].style.border='3px solid red';" +
                            "arguments[0].style.background='yellow';",
                    myInfo);

            Thread.sleep(2000);

            // Click using JavaScriptExecutor
            js.executeScript("arguments[0].click();", myInfo);

            Thread.sleep(3000);

            driver.quit();
        }
    }

