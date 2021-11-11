package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion {
    public int method(int a, int b){
        return a*b;
    }
    @Test
    public void validateMultiplication(){
        int resutl=method(-2,4);
        int expected=-8;
        Assert.assertEquals(resutl,expected,"Its for -2 and 4");
    }
    @Test
    public void validateZero(){
        int resutl=method(-3,0);
        int expected=0;
        Assert.assertEquals(resutl,expected,"Its for 3 and 0");
    }
    @Test
    public void validatePositive(){
        int resutl=method(2,3);

        Assert.assertTrue(resutl==6);
    }
    @Test
    public void validateNegative(){
        int resutl=method(-2,-3);
        int expected=6;
        Assert.assertEquals(resutl,expected);//When assertion fails the next line will not be executed
        //This is hard assertion
        System.out.println("Negative Test");
    }
}
