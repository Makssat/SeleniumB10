package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSelect {
    @Test
    public void test(){
        WebDriver driver=new ChromeDriver();
        driver.get("file:///Users/maksatmamazhakypuulu/Desktop/Techtorial%20(1).html");
        WebElement element=driver.findElement(By.xpath("//select[@class='select']"));
        Select select=new Select(element);
        select.selectByVisibleText("Three");
        select.selectByValue("4");
        select.deselectByVisibleText("Three");
        select.deselectAll();


    }
}
