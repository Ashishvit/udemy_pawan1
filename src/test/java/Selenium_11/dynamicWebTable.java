package Selenium_11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class dynamicWebTable {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demo.guru99.com/test/web-table-element.php");

            WebElement table = driver.findElement(By.xpath("//table"));
            List<WebElement> headers = table.findElements(By.xpath(".//thead//th"));
            List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

            // 1) Row & column count
            int rowCount = rows.size();
            int colCount = headers.size();
            System.out.println("Rows: " + rowCount + " | Cols: " + colCount);
            Assert.assertTrue(rowCount > 0);
            Assert.assertTrue(colCount > 0);

            // 2) Specific cell value (row 2, col 3)
            String cellVal = rows.get(1).findElements(By.tagName("td")).get(2).getText().trim();
            System.out.println("Cell(2,3) => " + cellVal);
            Assert.assertFalse(cellVal.isEmpty());

            // ===== 3) fetch a cell value based on another column's value =====
            String keyColumnName = "Company";
            String keyValue = "TCS";
            String targetColumnName = "Current Price (Rs.)";

            Map<String, Integer> headerIndex = IntStream.range(0, headers.size())
                    .boxed()
                    .collect(Collectors.toMap(i -> headers.get(i).getText().trim(), i -> i));

            Assert.assertTrue(headerIndex.containsKey(keyColumnName), "Missing key column");
            Assert.assertTrue(headerIndex.containsKey(targetColumnName), "Missing target column");

            int keyIdx = headerIndex.get(keyColumnName);
            int targetIdx = headerIndex.get(targetColumnName);

            Optional<String> found = rows.stream()
                    .map(r -> r.findElements(By.tagName("td")))
                    .filter(tds -> tds.size() > Math.max(keyIdx, targetIdx))
                    .filter(tds -> tds.get(keyIdx).getText().trim().equalsIgnoreCase(keyValue))
                    .map(tds -> tds.get(targetIdx).getText().trim())
                    .findFirst();

            String targetVal = found.orElse("NOT FOUND");
            System.out.println("Value of '" + targetColumnName + "' where '" + keyColumnName + "'='" + keyValue + "' : " + targetVal);
            Assert.assertNotEquals(targetVal, "NOT FOUND");

            // 4) Print all values of a column
            List<String> priceCol = rows.stream()
                    .map(r -> r.findElements(By.tagName("td")))
                    .filter(tds -> tds.size() > targetIdx)
                    .map(tds -> tds.get(targetIdx).getText().trim())
                    .collect(Collectors.toList());
            priceCol.forEach(System.out::println);
            Assert.assertEquals(priceCol.size(), rowCount);

            // 5) Print all table data
            rows.forEach(r -> {
                String rowTxt = r.findElements(By.tagName("td")).stream()
                        .map(WebElement::getText).collect(Collectors.joining(" | "));
                System.out.println(rowTxt);
            });

            // 6) Click inside a row (example)
            rows.stream()
                    .filter(r -> r.findElements(By.tagName("td")).get(keyIdx).getText().trim().equalsIgnoreCase(keyValue))
                    .findFirst()
                    .ifPresent(r -> {
                        try {
                            WebElement clickable = r.findElement(By.xpath(".//a | .//input[@type='checkbox'] | .//input[@type='radio'] | .//button"));
                            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickable);
                            clickable.click();
                            System.out.println("Clicked element for: " + keyValue);
                        } catch (NoSuchElementException e) {
                            Assert.fail("No clickable element for: " + keyValue);
                        }
                    });

            // 7) Validate sorting on target column
            List<String> values = rows.stream()
                    .map(r -> r.findElements(By.tagName("td")))
                    .filter(tds -> tds.size() > targetIdx)
                    .map(tds -> tds.get(targetIdx).getText().trim())
                    .collect(Collectors.toList());

            List<String> asc = values.stream().sorted().collect(Collectors.toList());
            List<String> desc = values.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());
            boolean sortedAsc = values.equals(asc);
            boolean sortedDesc = values.equals(desc);
            System.out.println("Sorted? asc=" + sortedAsc + " desc=" + sortedDesc);

            // 8) Verify record exists
            String searchText = "INFY";
            boolean exists = rows.stream().map(WebElement::getText).anyMatch(t -> t.contains(searchText));
            System.out.println("Record with '" + searchText + "' exists? " + exists);
            Assert.assertTrue(exists);

            // 9) Pagination (demo site has none, but sample loop)
            String valueToFind = "SomeCompany";
            boolean foundAcross = false;
            do {
                List<WebElement> currentRows = driver.findElements(By.xpath("//table//tbody/tr"));
                foundAcross = currentRows.stream().map(WebElement::getText).anyMatch(t -> t.contains(valueToFind));
                if (foundAcross) break;
                try {
                    WebElement next = driver.findElement(By.xpath("//a[text()='Next' or text()='›' or contains(@class,'next')]"));
                    if (!next.isEnabled()) break;
                    next.click();
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                } catch (Exception e) {
                    // no next button or can't paginate further
                    break;
                }
            } while (!foundAcross);
            System.out.println("Found across pages: " + foundAcross);

            // 10) Edit/Delete row dynamically (examples)
            String editKey = "RELIANCE";
            rows.stream()
                    .filter(r -> r.getText().contains(editKey))
                    .findFirst()
                    .ifPresent(r -> {
                        try {
                            WebElement editBtn = r.findElement(By.xpath(".//a[contains(text(),'Edit') or contains(@class,'edit') or contains(@title,'Edit')]"));
                            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", editBtn);
                            editBtn.click();
                            System.out.println("Clicked Edit for: " + editKey);
                        } catch (NoSuchElementException e) {
                            // Edit button not present for this row - handle as needed
                            System.out.println("Edit not found for: " + editKey);
                        }
                    });

            String deleteKey = "SomeCompanyToDelete";
            rows.stream()
                    .filter(r -> r.getText().contains(deleteKey))
                    .findFirst()
                    .ifPresent(r -> {
                        try {
                            WebElement delBtn = r.findElement(By.xpath(".//a[contains(text(),'Delete') or contains(@class,'delete') or contains(@title,'Delete')]"));
                            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", delBtn);
                            delBtn.click();
                            try {
                                driver.switchTo().alert().accept();
                            } catch (Exception ignored) {
                            }

                            // verify deletion by re-reading rows
                            List<WebElement> after = driver.findElements(By.xpath("//table//tbody/tr"));
                            boolean still = after.stream().map(WebElement::getText).anyMatch(t -> t.contains(deleteKey));
                            Assert.assertFalse(still, "Row still present after delete for: " + deleteKey);
                            System.out.println("Delete handled for: " + deleteKey);
                        } catch (NoSuchElementException e) {
                            System.out.println("Delete not found for: " + deleteKey);
                        }
                    });

        } finally {
            // cleanup
            if (driver != null) {
                driver.quit();
            }
        }
    }
}
