package Selenium_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoAllAction {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com"); // Replace with actual URL

        // Locate Elements
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("login"));
        WebElement rememberMe = driver.findElement(By.id("remember"));

        // ======================
        // WebElement Methods
        // ======================

        // sendKeys()
        username.sendKeys("Ashish");
        password.sendKeys("Password123");

        // clear()
        username.clear();
        username.sendKeys("Admin");

        // isDisplayed()
        System.out.println(username.isDisplayed());

        // isEnabled()
        System.out.println(loginBtn.isEnabled());

        // getAttribute()
        System.out.println(password.getAttribute("type"));

        // getCssValue()
        System.out.println(loginBtn.getCssValue("background-color"));

        // getText()
        System.out.println(loginBtn.getText());

        // isSelected()
        System.out.println(rememberMe.isSelected());

        // click()
        loginBtn.click();

        // submit()
        loginBtn.submit();


        // ======================
        // Assertions
        // ======================

        // Assert True
        Assert.assertTrue(username.isDisplayed());

        // Assert False
        Assert.assertFalse(rememberMe.isSelected());

        // Assert Equals
        Assert.assertEquals(loginBtn.getText(), "Login");

        // Assert Not Equals
        Assert.assertNotEquals(driver.getTitle(), "Register");

        // Assert Null
        String message = null;
        Assert.assertNull(message);

        // Assert Not Null
        Assert.assertNotNull(loginBtn);

        // Assert Equals (String)
        Assert.assertEquals(username.getAttribute("value"), "Admin");

        // Assert Not Equals (String)
        Assert.assertNotEquals(password.getAttribute("type"), "text");

        // Forcefully Fail Test
        // Uncomment when required
        // Assert.fail("Login functionality is not working.");

        driver.quit();
    }
}