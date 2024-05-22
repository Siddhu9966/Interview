package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ScreenShotExample {
    public static void main(String[] args) throws Exception {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

         driver.findElement((By.xpath("//input[@name='username']"))).sendKeys("Admin");
         driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
         driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("Clicked Submit button. Waiting.....");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='oxd-icon-button orangehrm-quick-launch-icon']")));

        System.out.println("Came to Screenshot code");
         TakesScreenshot scrFile =((TakesScreenshot)driver);
        File SrcFile = scrFile.getScreenshotAs(OutputType.FILE);
        File DestFile = new File("C:\\Users\\SAI SIDDHARDHA\\OneDrive\\Desktop\\New folder (2)\\sssample1.jpeg");
        FileUtils.copyFile(SrcFile,DestFile);

        System.out.println("Completed Screenshot");

    }
}
