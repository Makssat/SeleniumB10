package JavaScriptExecuter;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSMethods {
    @Test
    public void test() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techtorialacademy.com/");
        WebElement copyRigt=driver.findElement(By.xpath("//p[contains(text(),'Copyrights')]"));
        Point location=copyRigt.getLocation();
        System.out.println(location.getX());
        System.out.println(location.getY());
        int Xcod=location.getX();
        int Ycor=location.getY();
        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo("+Xcod+","+Ycor+")");
        Thread.sleep(2000);
        js.executeScript("history.go(0)");

    }
}
