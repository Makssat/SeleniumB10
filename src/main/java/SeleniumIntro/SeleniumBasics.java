package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {
    public static void main(String[] args) {
        //We are defining the chrome driver into the project as a property
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver=new ChromeDriver();
        //WebDriver is interface;
//        WebDriver driver=new ChromeDriver();
//        ChromeDriver driver=new ChromeDriver();
        //System.out.println(driver.getTitle());

        driver.get("https://www.techtorialacademy.com/#");
        String title=driver.getTitle();
        if(title.equals("Home Page - Techtorial")){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println(title);
        driver.quit();






    }
}
