package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public String execute(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        }
        throw new UnsupportedOperationException();
    }

}
