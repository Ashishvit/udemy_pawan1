package Selenium_11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableAllOperation {

        public static void main(String[] args) throws InterruptedException {

            // Launch Browser
            WebDriver driver = new ChromeDriver();
            // Open Application
            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();
            // Store required Product IDs
            List<String> requiredIDs = Arrays.asList("101", "205", "310");


            // Get total number of columns
            List<WebElement> columns = driver.findElements(
                    By.xpath("//table[@id='productTable']//thead//th"));

            System.out.println("Total Columns = " + columns.size());


            // Get total number of pages
            List<WebElement> pages = driver.findElements(
                    By.xpath("//ul[@id='pagination']//li"));

            int totalPages = pages.size();


            // Used for record verification
            boolean recordFound205 = false;


            // Used for sorting verification
            List<String> actualNames = new ArrayList<>();


            // Visit all pages one by one
            for (int p = 1; p <= totalPages; p++) {

                // Click page number
                driver.findElement(
                                By.xpath("//ul[@id='pagination']//li[" + p + "]"))
                        .click();

                Thread.sleep(2000);


                // Get all rows of the current page
                List<WebElement> rows = driver.findElements(
                        By.xpath("//table[@id='productTable']//tbody//tr"));

                int totalRows = rows.size();

                System.out.println("Total Rows = " + totalRows);


                // Print complete table data
                for (int r = 1; r <= totalRows; r++) {

                    for (int c = 1; c <= 4; c++) {

                        String data = driver.findElement(
                                        By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]/td[" + c + "]"))
                                .getText();

                        System.out.print(data + "\t");
                    }

                    System.out.println();
                }


                // Fetch a particular cell value
                // Example : Row 2 and Column 3

                if (totalRows >= 2) {

                    String cellValue = driver.findElement(
                                    By.xpath("//table[@id='productTable']//tbody//tr[2]/td[3]"))
                            .getText();

                    System.out.println("Cell Value = " + cellValue);
                }


                // Visit every row
                for (int r = 1; r <= totalRows; r++) {

                    // Get Product ID
                    String id = driver.findElement(
                                    By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]/td[2]"))
                            .getText();


                    // Get Product Name
                    String name = driver.findElement(
                                    By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]/td[3]"))
                            .getText();


                    // Get Product Price
                    String price = driver.findElement(
                                    By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]/td[4]"))
                            .getText();


                    // Print Product Names (Particular Column)
                    System.out.println("Product Name = " + name);


                    // Store product names for sorting verification
                    actualNames.add(name);


                    // Search multiple Product IDs
                    if (requiredIDs.contains(id)) {

                        // Click checkbox
                        driver.findElement(
                                        By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]/td[1]/input"))
                                .click();


                        // Print Product Details
                        System.out.println("Checkbox Selected");
                        System.out.println("ID = " + id);
                        System.out.println("Name = " + name);
                        System.out.println("Price = " + price);
                        System.out.println("-----------------------");
                    }


                    // Verify Product ID 205 exists
                    if (id.equals("205")) {

                        recordFound205 = true;

                        System.out.println("Product ID 205 Found");


                        // Click Edit button (Example XPath)
                        // driver.findElement(By.xpath("EDIT_BUTTON_XPATH")).click();


                        // Verify Product Name using TestNG Assertion
                        Assert.assertEquals(name, "Keyboard");
                    }


                    // Verify Product ID 310 exists
                    if (id.equals("310")) {

                        System.out.println("Product ID 310 Found");


                        // Click Delete button (Example XPath)
                        // driver.findElement(By.xpath("DELETE_BUTTON_XPATH")).click();
                    }
                }
            }


            // Verify record exists
            Assert.assertTrue(recordFound205);


            // Click Name column header for sorting (Example XPath)
            // driver.findElement(By.xpath("//th[text()='Name']")).click();
            // Verify sorting by Product Name (A to Z)
            List<String> sortedNames = new ArrayList<>(actualNames);
            Collections.sort(sortedNames);
            Assert.assertEquals(actualNames, sortedNames);
            System.out.println("Product Names are sorted alphabetically.");
            // Close Browser
            driver.quit();
        }
    }

