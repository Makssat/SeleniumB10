package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/checkbox");
        WebElement homeCheck=driver.findElement(By.xpath("//button[@title='Toggle']"));
        homeCheck.click();
        WebElement arrowHome=driver.findElement(By.xpath("//button[@title='Toggle']"));
        arrowHome.click();
//        driver.findElement(By.xpath("//li[.='Documents']//button")).click();
//        WebElement arrowDownlaods=driver.findElement(By.xpath("//span[.='Office']"));
//        System.out.println(arrowDownlaods.getText());
//        Thread.sleep(3000);
//        driver.quit();


    }
}
