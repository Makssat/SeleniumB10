package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/");

        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("maks_m_u");

        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("m1n2g3r4");
driver.quit();
    }
}
