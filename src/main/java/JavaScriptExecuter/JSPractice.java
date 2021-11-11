package JavaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSPractice {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techtorialacademy.com/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        String title= (String) js.executeScript("return document.title");
        System.out.println(title);
        WebElement browseCourse=driver.findElement(By.xpath("//a[contains(text(),'Browse Course')]"));
        js.executeScript("arguments[0].click()",browseCourse);
        WebElement copyRight=driver.findElement(By.xpath("//p[contains(text(),'2021')]"));
        js.executeScript("arguments[0].scrollIntoView(true)",copyRight);
        Thread.sleep(1000);
        WebElement burgerMenu=driver.findElement(By.xpath("//div[@class='logo']"));
        js.executeScript("arguments[0].scrollIntoView(true)",burgerMenu);



    }
}
