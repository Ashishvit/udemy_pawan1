package Selenium_11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AutoWaitDemo {

        public static void main(String[] args) {

            // Launch Browser
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            // ==================================================
            // IMPLICIT WAIT
            // ==================================================
            // Applied globally to all findElement() calls.
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // ==================================================
            // EXPLICIT WAIT
            // ==================================================
            // Used for specific elements and conditions.
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Wait until Username field is visible
            WebElement username = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.name("username")));
            username.sendKeys("Admin");

            // Wait until Password field is visible
            WebElement password = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.name("password")));
            password.sendKeys("admin123");

            // Wait until Login button is clickable
            WebElement loginButton = wait.until(
                    ExpectedConditions.elementToBeClickable(
                            By.xpath("//button[@type='submit']")));
            loginButton.click();

            // Wait until page URL contains dashboard
            wait.until(
                    ExpectedConditions.urlContains("dashboard"));

            // Wait until Dashboard text is visible
            WebElement dashboard = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//h6[text()='Dashboard']")));

            System.out.println("Explicit Wait Passed : " + dashboard.getText());


            // ==================================================
            // FLUENT WAIT
            // ==================================================
            // Advanced Explicit Wait with polling interval and
            // exception handling.
            FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(20))
                    .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(NoSuchElementException.class);

            // Wait for Dashboard element using Fluent Wait
            WebElement dashboardText = fluentWait.until(driver1 ->
                    driver1.findElement(
                            By.xpath("//h6[text()='Dashboard']")));

            System.out.println("Fluent Wait Passed : "
                    + dashboardText.getText());


            // ==================================================
            // SYNCHRONIZATION ISSUE HANDLING
            // ==================================================
            // Handle Stale Element Exception.

            wait.ignoring(StaleElementReferenceException.class)
                    .until(ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//h6[text()='Dashboard']")));

            System.out.println("Synchronization Issue Handled Successfully.");


            // Close Browser
            driver.quit();
        }
    }

