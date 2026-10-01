package Selenium_11.selenium2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextMatch {

    @Test
    public void verifyPhoneProduct() {

        // 1. Open Chrome
        WebDriver driver = new ChromeDriver();

        // 2. Open Amazon
        driver.get("https://www.amazon.in");

        // 3. Maximize browser
        driver.manage().window().maximize();

        // 4. Search "phone"
        driver.findElement(By.id("twotabsearchtextbox"))
                .sendKeys("phone");

        // 5. Click Search
        driver.findElement(By.id("nav-search-submit-button"))
                .click();

        // 6. Get all product names
        List<WebElement> products = driver.findElements(
                By.xpath("//div[@data-component-type='s-search-result']//h2")
        );

        // 7. Check whether "phone" is present in any product
        boolean found = false;

        for (WebElement product : products) {

            String productName = product.getText();

            System.out.println(productName);

            if (productName.toLowerCase().contains("phone")) {
                found = true;
                break;
            }
        }

        // 8. Assertion
        Assert.assertTrue(found, "Phone product is NOT present in the list");

        System.out.println("Phone product is present in the list");

        // 9. Close browser
        driver.quit();
    }
}