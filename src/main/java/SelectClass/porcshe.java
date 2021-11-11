package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class porcshe {
    @Test
    public void test() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cars.com/");
        WebElement make=  driver.findElement(By.id("makes"));
//        Select select=new Select(make);
//        select.selectByVisibleText("Porsche");
        WebElement model=driver.findElement(By.id("models"));
        Thread.sleep(1000);
//        Select select1=new Select(model);
        BrowserUtils.selectBy(make,"porsche","value");
        BrowserUtils.selectBy(model,"5","index");
//        select1.selectByValue("porsche-911");
        driver.findElement(By.xpath("//button[@data-searchtype='make']")).click();
        Thread.sleep(2000);
        WebElement headerActual=driver.findElement(By.xpath("//h1[.='New and used Porsche 911 for sale']"));
        String actual=BrowserUtils.getText(headerActual);
        String expected="New and used Porsche 911 for sale";
        Assert.assertEquals(actual,expected);
        driver.quit();

    }
}
