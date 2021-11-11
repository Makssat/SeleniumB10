package SeleniumLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        WebElement element=driver.findElement(By.name("btnK"));
        String str="Google Search";
        if (str.equals(element.getAttribute("aria-label"))){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
