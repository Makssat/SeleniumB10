package SeleniumLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iphone13 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Iphone 13");
        driver.findElement(By.name("btnK")).click();
        String str=(driver.findElement(By.xpath("//*[@id=\"result-stats\"]/nobr")).getText());
        System.out.println(  str.substring(1,5));

        double a = Double.parseDouble(str.substring(1,5));
       if( a<3){
           System.out.println("Valid");
       }

    }
}
