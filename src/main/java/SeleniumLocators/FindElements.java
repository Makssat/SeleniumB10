package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        List<WebElement> links=driver.findElements(By.xpath("//li/a"));
        int count=0;
        for(WebElement list:links){
            if(list.getText().length()<12){
                count++;
                System.out.println(list.getText());
                System.out.println(list.getAttribute("href"));
            }
        }
        System.out.println(count);
    }
}
