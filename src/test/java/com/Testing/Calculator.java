package com.testing;

public class Calculator {

    public int Add(String numbers){
        String t1;
        String t2;

        if (numbers.isEmpty()){
            return 0;
        }
        else if (numbers.length() == 1){
            return Integer.parseInt(numbers);
        }
        else {
            t1 = numbers.substring(0,1);
            t2 = numbers.substring(2);

            return Integer.parseInt(numbers) + Integer.parseInt(numbers);
        }
    }
}
