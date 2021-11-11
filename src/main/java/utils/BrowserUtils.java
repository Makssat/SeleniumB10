package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserUtils {
    //We will create our methods related with browser
    //Inside the browserUtils class
    /*
    method that accepts three param- WebElement and value,method name
    SelectbyVisibletext
     */
    public static void selectBy(WebElement element,String value, String methodName){
        //method name can be text , index value
        Select select=new Select(element);
        switch (methodName){
            case "text" :
                select.selectByVisibleText(value);
                break;
            case "value":
                select.selectByValue(value);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            default:
                System.out.println("Method name is not available. Use text, value , or index for method name");
        }
    }
    //Method will get webelement and return text
    public static String getText(WebElement element){
        return element.getText().trim();
    }
}
