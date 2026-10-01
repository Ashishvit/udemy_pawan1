package Selenium_11;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WindowType;
import java.util.Set;
//swithc by title
public class WH_SwitchtoParticularWindow
{

    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Parent window
        driver.get("https://www.bing.com");
        String parent = driver.getWindowHandle();
        // Open 5 tabs
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.paypal.com");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.flipkart.com");
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.wikipedia.org");
        Thread.sleep(2000);
        // Get all window handles
        Set<String> windows = driver.getWindowHandles();

        // 🔹 Switch to window by Title
        for (String handle : windows) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains("Google")) {   // using contains for safety
                System.out.println("✅ Switched to Google window");
                break;
            }
        }

       // driver.switchTo().window(parent);
       // System.out.println("🔄 Back to Parent Window: " + driver.getTitle());

        //Thread.sleep(3000);
        //driver.quit();
    }
}
//other process
       // Set<String> windows = driver.getWindowHandles();

       // Convert Set → List
       // List<String> windowList = new ArrayList<>(windows);

        // 🔹 Switch to 2nd window (index = 1, since index starts from 0)
       // driver.switchTo().window(windowList.get(1));
       // System.out.println("✅ Switched to 2nd window, Title: " + driver.getTitle());


