package Selenium_11;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

//invoke multiple window/tap from selenium using one driver instance
//scenario nevigate to "https://rahulshettyacademy.com/angularpractice/" fill the "name" field course name available at
//https://rahulshettyacademy.com/
public class multipe_window_open
{
    public static void main(String arg[]) throws IOException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com/angularpractice/");
    driver.switchTo().newWindow(WindowType.TAB);
        Set<String> handle = driver.getWindowHandles();
        Iterator<String> it = handle.iterator();
        String parentWindowId = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        driver.get("https://rahulshettyacademy.com/");
        String courseName = driver.findElement(By.xpath("//a[contains(text(),'All-Access Membership-Complete Access to 25+ Cours')]")).getText();
        driver.switchTo().window(parentWindowId);

        WebElement name=driver.findElement(By.cssSelector("[name='name']"));
        name.sendKeys(courseName);
//Screenshot
        File file=name.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("logo.png"));
//driver.quit();

//GEt Height & Width
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());

    }





    }

