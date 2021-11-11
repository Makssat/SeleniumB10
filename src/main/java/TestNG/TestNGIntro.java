package TestNG;

import org.testng.annotations.Test;

public class TestNGIntro {
    @Test(priority = 1)
    public void test1(){
        System.out.println("Test 1");
    }
    @Test
    public void test2(){
        System.out.println("Test 2");
    }
    @Test(priority = 2)
    public void test(){
        String str="";
        System.out.println("Test 3");
    }

}
