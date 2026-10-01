package Selenium_11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Calender {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://jqueryui.com/datepicker/");

            // Switch to iframe
            driver.switchTo().frame(0);

            // Open calendar
            driver.findElement(By.id("datepicker")).click();

            String targetMonth = "December";
            String targetYear = "2026";
            String targetDate = "25";

            // Navigate to required month and year
            while (true) {

                String currentMonth = driver.findElement(
                        By.className("ui-datepicker-month")).getText();

                String currentYear = driver.findElement(
                        By.className("ui-datepicker-year")).getText();

                if (currentMonth.equals(targetMonth)
                        && currentYear.equals(targetYear)) {
                    break;
                }

                // Click next month button
                driver.findElement(By.xpath("//a[@title='Next']")).click();
            }

            // Select required date
            driver.findElement(
                    By.xpath("//a[text()='" + targetDate + "']")).click();

            driver.quit();
        }
    }

