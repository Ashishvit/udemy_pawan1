package Selenium_11;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinkLatest {

        public static void main(String[] args) throws Exception {

            WebDriver driver = new ChromeDriver();

            // Open the website
            driver.get("https://testautomationpractice.blogspot.com/");

            // Find all links present on the page
            List<WebElement> links = driver.findElements(By.tagName("a"));

            // Print total number of links
            System.out.println("Total Links : " + links.size());

            // Loop through all the links
            for (WebElement link : links) {

                // Get the URL from href attribute
                String url = link.getAttribute("href");

                // Ignore null or empty URLs
                if (url == null || url.isEmpty()) {
                    continue;
                }

                // Create URL object
                URL linkURL = new URL(url);

                // Open connection
                HttpURLConnection connection =
                        (HttpURLConnection) linkURL.openConnection();

                // Connect to the server
                connection.connect();

                // Get HTTP response code
                int responseCode = connection.getResponseCode();

                // Check whether the link is working or broken
                if (responseCode >= 400) {

                    System.out.println(url + " --> Broken Link");

                } else {

                    System.out.println(url + " --> Working Link");
                }

                // Close the connection
                connection.disconnect();
            }

            driver.quit();
        }
    }

