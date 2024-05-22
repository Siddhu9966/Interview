package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(7000);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//span[text()=\"Admin\"]")).click();
        //Thread.sleep(5000);
        // driver.findElement(By.xpath("//div[text()=\"rahul\"]/../following-sibling::div//button[2]")).click();
        //Thread.sleep(5000);
        // driver.findElement(By.xpath("//label[text()=\"User Role\"]/../following-sibling::div//i/..")).click();
        // Actions action = new Actions(driver);
        //action.sendKeys(Keys.ARROW_DOWN).build().perform();
        // action.sendKeys(Keys.ENTER).build().perform();
        // Thread.sleep(5000);
        driver.findElement((By.xpath("//span[text()=\"PIM\"]"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()=\"Add Employee\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Siddu");
        driver.findElement(By.xpath("//input[@name=\"middleName\"]")).sendKeys("sai");
        driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("miryala");
        driver.findElement(By.xpath("//label[text()=\"Employee Id\"]/../following-sibling::div/input")).sendKeys("50056");
        driver.findElement(By.xpath("//button[text()=\" Save \"]")).click();
        Thread.sleep(5000);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()=\"Employee List\"]/..")).click();
        //driver.findElement(By.xpath("//a[text()=\"Employee List\"]/..")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Krishnam");
        driver.findElement(By.xpath("//div[text()=\"Krishnam raju\"]/../preceding-sibling::div[2]//span")).click();
        Thread.sleep(15000);
        driver.close();


        //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        //        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='oxd-brand']")))
    }

}
