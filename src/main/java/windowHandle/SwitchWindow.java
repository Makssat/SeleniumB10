package windowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchWindow {
    @Test
    public void test(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement link=driver.findElement(By.linkText("Click Here"));
        link.click();
        String mainWindowId=driver.getWindowHandle();
        Set<String> ids=driver.getWindowHandles();
        for (String id:ids
             ) {
            if (!id.equals(mainWindowId)){
                driver.switchTo().window(id);
            }
        }

        WebElement text=driver.findElement(By.xpath("//h3"));
        String actualText=text.getText();
        String expectedText="New Window";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void test2(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement link=driver.findElement(By.linkText("Click Here"));
        link.click();
        String mainWindowId=driver.getWindowHandle();
        Set<String> ids=driver.getWindowHandles();
        for (String id: ids
             ) {
            if(!id.equals(mainWindowId)){
                driver.switchTo().window(id);
                driver.close();//Close only one window
            }

        }
        driver.switchTo().window(mainWindowId);
        Assert.assertEquals(driver.getTitle(),"The Internet");

    }

}
