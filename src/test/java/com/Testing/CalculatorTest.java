package com.testing;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest
{
    @Test
    public void test(){
        String Result = "1,3";
        int experct = 4;


        Calculator obj = new Calculator();

        int output = obj.Add("1,3,6");
        assertEquals(10, output);
    }
}
