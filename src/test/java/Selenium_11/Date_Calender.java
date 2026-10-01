package Selenium_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;   // ✅ For assertion
import java.util.List;

public class Date_Calender
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.goibibo.com/");  // Or any calendar site
        Thread.sleep(2000); // Wait for popup to load
        driver.findElement(By.xpath("//span[@class=\"sc-koXPp bDtzaf\"]")).click();
        // Click on "Departure" calendar input
        driver.findElement(By.xpath("//span[text()='Departure']")).click();
        String targetMonthYear = "June 2026";
        String targetDate = "23";
        while (true)
        {
            // Get currently visible month-year text
            WebElement currentMonthYear = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption']/div)[1]"));

            if (currentMonthYear.getText().equalsIgnoreCase(targetMonthYear))
            {
                List<WebElement> allDates = driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
                for (WebElement dateElement : allDates)
                {
                    if (dateElement.getText().equalsIgnoreCase(targetDate))
                        {
                        dateElement.click();
                        Thread.sleep(2000); // Wait for date to be applied
                        break;
                    }
                }
                break; // ✅ exit while loop once date is selected
            }
            else
            {
                // Click next month button
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
                Thread.sleep(1000);
            }
        }

        // ✅ Assertion - Check if the selected date is displayed in Departure field
        WebElement selectedDate = driver.findElement(By.xpath("//p[@class='fsw__date']"));
        String actualDate = selectedDate.getText();
        System.out.println("Selected Date: " + actualDate);

        // Assert that selected date contains targetDay
        Assert.assertTrue(actualDate.contains(targetDate), "Date selection failed!");

        driver.quit(); // Close browser
    }
}
