package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAndTags {
    public static void main(String[] args) throws  InterruptedException  {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///Users/maksatmamazhakypuulu/Desktop/Techtorial.html");
        //LinkText , Partial Link text
        WebElement java=driver.findElement(By.linkText("Java"));
        java.click();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        WebElement selenium  =driver.findElement(By.linkText("Selenium"));
        selenium.click();
        driver.navigate().back();
        java=driver.findElement(By.linkText("Java"));
        java.click();
        driver.navigate().back();
        WebElement rest=driver.findElement(By.partialLinkText("Rest"));
        rest.click();
        driver.navigate().back();
        WebElement verisonText=driver.findElement(By.tagName("u"));
        System.out.println(verisonText);
        Thread.sleep(5000);

        driver.close();



    }
}
