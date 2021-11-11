package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsIntro {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///Users/maksatmamazhakypuulu/Desktop/Techtorial.html");
        WebElement header=driver.findElement(By.id("techtorial1"));
        String hdr=header.getText();
        String expected ="Techtorial Academy";
        if(hdr.equals(expected)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        WebElement checkboxTitle=driver.findElement(By.className("group_checkbox"));
        System.out.println(checkboxTitle+"WEbelement sout");
        String actualTitle=checkboxTitle.getText();
        String expectedTitle="All Tools";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("True");

        }else{
            System.out.println("False");
        }
        WebElement fname=driver.findElement(By.name("firstName"));
        WebElement lName=driver.findElement(By.name("lastName"));
        WebElement phone=driver.findElement(By.name("phone"));
        WebElement email=driver.findElement(By.name("userName"));

        fname.sendKeys("Maksat");
        lName.sendKeys("M");
        phone.sendKeys("3122889960");
        email.sendKeys("maksat@gmail.com");
       WebElement java= driver.findElement(By.id("cond1"));
       WebElement selenium=driver.findElement(By.id("cond2"));
        WebElement testng=driver.findElement(By.id("cond3"));
        WebElement cucumebr=driver.findElement(By.id("cond3"));
        System.out.println(java.getText());




    }
}
