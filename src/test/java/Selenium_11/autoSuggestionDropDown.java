package Selenium_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class autoSuggestionDropDown
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");
        // Enter "cricket" in the search box
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("cricket");
        // Wait for suggestions to load
        Thread.sleep(2000);
        // Capture all suggestions
        List<WebElement> suggestionsList = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li"));
        System.out.println("Total Suggestions: " + suggestionsList.size());
        for (WebElement suggestion : suggestionsList)
        {
            if (suggestion.getText().equalsIgnoreCase("cricket score"))
            {
                suggestion.click();
                break;
            }

            // driver.quit();
        }
    }
}
// Loop and select the matching keyword
// String expectedText = "cricket score";  // you can change this
//for (WebElement suggestion : suggestions)
// {
//     String actualText = suggestion.getText();
// if (actualText.equalsIgnoreCase(expectedText))
// {
//System.out.println("Selected Suggestion: " + actualText);
//Thread.sleep(2000);
//suggestion.click();
/// break; // stop loop after clicking
// /}
//}

// Close browser



