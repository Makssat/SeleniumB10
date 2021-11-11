package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myHtmlGetter {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("file:///Users/maksatmamazhakypuulu/Desktop/cv.html");
        driver.findElement(By.xpath("/html/body/a[2]")).click();
        driver.findElement(By.name("date")).sendKeys("09122021");
        Thread.sleep(4000);
        driver.findElement(By.name("text")).sendKeys("Maksat");
        driver.findElement(By.name("emailText")).sendKeys("maks@gmail.com");

        Thread.sleep(4000);
        driver.findElement(By.name("messageText")).sendKeys("There comes that awkward point when it’s " +
                "been a while since you’ve talked to someone you care about, and you want to check in to tell them" +
                " “I’m thinking of you.” Maybe they’ve been busy. Maybe you’ve been busy. Whatever the case may be, " +
                "you miss them, and you want to " +
                "reach out, but you worry a text or other digital exchange will just get lost in the shuffle.");
        Thread.sleep(4000);
        driver.findElement(By.name("submit")).click();





    }
}
