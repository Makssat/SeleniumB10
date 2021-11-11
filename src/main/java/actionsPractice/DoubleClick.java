package actionsPractice;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.util.List;

public class DoubleClick {
    @Test
    public void doubleClick(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml?jfwid=1382a");
       List<WebElement> element= driver.findElements(By.xpath("//div[contains(text(),'click')]"));
        Actions actions=new Actions(driver);
        //System.out.println(driver.findElement(By.xpath("//div[contains(text(),'doubleclick')]")).getText());
        for (WebElement ele: element){
            if(BrowserUtils.getText(ele).equals("click")){
                ele.click();
            }else{
                actions.doubleClick(ele).perform();

            }
        }

    }
}
