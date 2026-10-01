package Selenium_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;


    public class windowHandle {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();

            // 1st Tab → Google
            driver.get("https://www.google.com");
            String googleHandle = driver.getWindowHandle();

            // 2nd Tab → Facebook
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://www.facebook.com");

            // 3rd Tab → Amazon
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://www.amazon.com");

            // ✅ Get all window handles
            Set<String> allHandles = driver.getWindowHandles();
            System.out.println(allHandles);
            System.out.println("All Window Handles:");
            for (String handle : allHandles) {
                driver.switchTo().window(handle);
                System.out.println("Window ID: " + handle + " | Title: " + driver.getTitle());
            }

            // ✅ Switch back to Google
            driver.switchTo().window(googleHandle);
            System.out.println("Back to Google: " + driver.getTitle());

            driver.quit();
        }
    }




