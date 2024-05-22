package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMExample
{
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://books-pwakit.appspot.com/");
        driver.manage().window().maximize();

        WebElement root = driver.findElement(By.tagName("book-app"));
        JavascriptExecutor js = ((JavascriptExecutor)driver);
        WebElement shadowDom1 = (WebElement)js.executeScript("return arguments[0].shadowRoot;f",root);
        System.out.println(shadowDom1);
        driver.quit();
    }
}
