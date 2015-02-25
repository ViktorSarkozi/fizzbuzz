package com.wcs.fizzbuzz;

public class FizzBuzzer {
    
    public String execute(int number) {
        for (int i = 0; i < 100; i++) {
            if(i%3==0){
                return "fizz";
            }
        }
        throw new UnsupportedOperationException();
    }
    
}
