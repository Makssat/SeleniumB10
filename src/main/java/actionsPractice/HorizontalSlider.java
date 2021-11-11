package actionsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HorizontalSlider {
    public  void mover(WebElement slider,WebElement text,WebDriver driver, Double target){
        Actions actions=new Actions(driver);
       if(target==2.5){
           actions.click(slider).perform();
       }else if(target>2.5){
           int count=10;
           while (!text.getText().equals(String.valueOf(target))){
               actions.clickAndHold(slider).moveByOffset(count,0).perform();
               count+=10;
           }
       }else{
           int count=-10;
           while(!text.getText().equals(String.valueOf(target))){
               actions.clickAndHold(slider).moveByOffset(count,0).perform();
               count-=10;
           }
       }
    }
    @Test
    public void test(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
        WebElement slider=driver.findElement(By.xpath("//input"));
        WebElement text=driver.findElement(By.id("range"));
        mover(slider,text,driver,4.0);
//        Actions actions=new Actions(driver);
//        actions.clickAndHold(slider).moveByOffset(-55,0).perform();
//        Point point=slider.getLocation();
//        System.out.println(point.getX());
//        System.out.println(point.getY());



    }
}
