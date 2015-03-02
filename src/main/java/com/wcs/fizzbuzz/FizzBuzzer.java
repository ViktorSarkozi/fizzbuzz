package com.wcs.fizzbuzz;

public class FizzBuzzer {

    public String execute(int number) {
        if (number % 7 == 0) {
            return "Wizz";
        } else if (contains(number, "7")) {
            return "Wizz";
        } else if (number % 15 == 0) {
            return "fizzbuzz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else if (contains(number, "5")) {
            return "Buzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (contains(number, "3")) {
            return "Fizz";
        } else {
            return String.valueOf(number);
        }
    }

    private boolean contains(int number, String i) {
        if (String.valueOf(number).contains(i)) {
            return true;
        } else {
            return false;
        }
    }

}
