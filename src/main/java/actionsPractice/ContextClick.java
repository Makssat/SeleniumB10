package actionsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContextClick {
    @Test
    public void test(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //Actions actions=new Actions();
       WebElement box= driver.findElement(By.id("hot-spot"));
       Actions actions=new Actions(driver);//Takes driver as a argument
        actions.contextClick(box).perform();
    }
    @Test
    public void hoverOver(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        List<WebElement> names=driver.findElements(By.xpath("//h5"));
        List<WebElement> pictures=driver.findElements(By.xpath("//div/img"));
        Actions actions=new Actions(driver);
        List<String> actualNames=new ArrayList<>();
        List<String> expectedNames= Arrays.asList("name: user1","name: user2","name: user3");
        for (int i = 0; i < names.size(); i++) {
            actions.moveToElement(pictures.get(i)).perform();
            System.out.println(BrowserUtils.getText(names.get(i)));

            actualNames.add(BrowserUtils.getText(names.get(i)));
        }
        Assert.assertEquals(actualNames,expectedNames);

    }


}
