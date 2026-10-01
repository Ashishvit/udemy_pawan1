package Selenium_11;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
public class Upload_Download_file
{
    public static void main(String args[])
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
        driver.findElement(By.id("downloadButton")).click();//download code
        driver.findElement(By.id("fileinput")).sendKeys("C:\\Users\\Ashish\\Downloads\\download.xlsx");//download code



     //   id="fileinput"

    }
}
