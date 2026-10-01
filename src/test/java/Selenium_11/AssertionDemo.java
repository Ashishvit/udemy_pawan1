package Selenium_11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionDemo {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            // Demo URL
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Wait only for demo purposes
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // ================= WebElements =================

            WebElement username = driver.findElement(By.name("username"));
            WebElement password = driver.findElement(By.name("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            // Enter values
            username.sendKeys("Admin");
            password.sendKeys("admin123");

            // ======================================================
            // assertTrue()
            // ======================================================

            Assert.assertTrue(username.isDisplayed(),
                    "Assertion Failed: Username field is NOT displayed.");

            Assert.assertTrue(password.isEnabled(),
                    "Assertion Failed: Password field is NOT enabled.");

            Assert.assertTrue(loginButton.getText().contains("Login"),
                    "Assertion Failed: Login button text does NOT contain 'Login'.");

            // ======================================================
            // assertFalse()
            // ======================================================

            Assert.assertFalse(username.getAttribute("value").contains("XYZ"),
                    "Assertion Failed: Username contains 'XYZ'.");

            // ======================================================
            // assertEquals()
            // ======================================================

            String actualUsername = username.getAttribute("value");
            String expectedUsername = "Admin";

            Assert.assertEquals(actualUsername, expectedUsername,
                    "Assertion Failed: Username value is incorrect.");

            // ======================================================
            // assertNotEquals()
            // ======================================================

            Assert.assertNotEquals(password.getAttribute("value"), "123456",
                    "Assertion Failed: Password should NOT be '123456'.");

            // ======================================================
            // assertNotNull()
            // ======================================================

            Assert.assertNotNull(loginButton,
                    "Assertion Failed: Login button is NULL.");

            // ======================================================
            // assertNull()
            // ======================================================

            String nullValue = null;

            Assert.assertNull(nullValue,
                    "Assertion Failed: Value is NOT null.");

            // ======================================================
            // contains()
            // ======================================================

            String userValue = username.getAttribute("value");

            Assert.assertTrue(userValue.contains("Adm"),
                    "Assertion Failed: Username does NOT contain 'Adm'.");

            // ======================================================
            // startsWith()
            // ======================================================

            Assert.assertTrue(userValue.startsWith("Ad"),
                    "Assertion Failed: Username does NOT start with 'Ad'.");

            // ======================================================
            // endsWith()
            // ======================================================

            Assert.assertTrue(userValue.endsWith("min"),
                    "Assertion Failed: Username does NOT end with 'min'.");

            // ======================================================
            // equalsIgnoreCase()
            // ======================================================

            Assert.assertTrue(userValue.equalsIgnoreCase("admin"),
                    "Assertion Failed: Username does NOT match ignoring case.");

            // ======================================================
            // assertSame()
            // ======================================================

            String str1 = userValue;
            String str2 = str1;

            Assert.assertSame(str1, str2,
                    "Assertion Failed: Both references are NOT same.");

            // ======================================================
            // assertNotSame()
            // ======================================================

            String str3 = new String("Admin");
            String str4 = new String("Admin");

            Assert.assertNotSame(str3, str4,
                    "Assertion Failed: Both references should NOT be same.");

            // ======================================================
            // Title Assertion
            // ======================================================

            String actualTitle = driver.getTitle();

            Assert.assertTrue(actualTitle.contains("OrangeHRM"),
                    "Assertion Failed: Title does NOT contain 'OrangeHRM'.");

            // ======================================================
            // URL Assertion
            // ======================================================

            String actualURL = driver.getCurrentUrl();

            Assert.assertTrue(actualURL.contains("orangehrmlive"),
                    "Assertion Failed: URL is incorrect.");

            System.out.println("All Assertions Passed Successfully.");

            driver.quit();
        }
    }

