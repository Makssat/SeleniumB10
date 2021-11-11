package SeleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_1 {
    public static void main(String[] args) {
//        Assignment Level - Beginner
//        Test Case 1 - Open Godaddy.com and maximize browser window.
//                Steps to Automate:
//        1. Launch browser of your choice say., Firefox, chrome etc.
//        2. Open this URL - https://www.godaddy.com/
//        3. Maximize or set size of browser window.
//        Get Title of page and print it.
//        4. Get URL of current page and print it.
//        4. Close browser.
        WebDriver driver=new ChromeDriver();
        driver.get(" https://www.godaddy.com/");
        driver.manage().window().maximize();
        String title="Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy";
        if(title.equals(driver.getTitle())){
            System.out.println("Site title is succesfull");
        }else{
            System.out.println("Title is unsuccesful u provided "+title);
        }
        String url="https://www.godaddy.com/";
        if(url.equals(driver.getCurrentUrl())){
            System.out.println("Current URL IS VALIDATED");
        }else{
            System.out.println("Not validated");
        }


        System.out.println(driver.getCurrentUrl());
        driver.quit();
    }
}
