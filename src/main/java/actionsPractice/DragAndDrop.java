package actionsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

public class DragAndDrop {

    @Test
    public void drag(){
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().window().maximize();
        WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement orange=driver.findElement(By.className("test2"));
        String actualText= BrowserUtils.getText(orange);
        String expectedText="... Or here.";
        Assert.assertEquals(actualText,expectedText);
        Actions actions=new Actions(driver);
        actions.dragAndDrop(draggable,orange).perform();
        orange= driver.findElement(By.className("test2"));//Text is updating so i need reinstantiate element
        String succesMessage=BrowserUtils.getText(orange);
        String expectedMessage="You did great!";
        Assert.assertEquals(succesMessage,expectedMessage);
        String cssValue=orange.getCssValue("background-color");
        System.out.println(cssValue);
        Assert.assertEquals(cssValue,"rgba(238, 111, 11, 1)");


    }
    @Test
    public void test2() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");
        driver.manage().window().maximize();
        WebElement draggable=driver.findElement(By.id("draggable"));
        WebElement blue=driver.findElement(By.className("test1"));
        WebElement cookies=driver.findElement(By.id("onetrust-accept-btn-handler"));
        cookies.click();
        Actions actions=new Actions(driver);
        actions.clickAndHold(draggable).moveToElement(blue).release().perform();
    }
}
