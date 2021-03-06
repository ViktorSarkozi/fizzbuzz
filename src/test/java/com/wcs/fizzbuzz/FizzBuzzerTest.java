package com.wcs.fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzerTest {

    private FizzBuzzer fizzBuzzer = new FizzBuzzer();

    @Test
    public void executeShouldReturnFizzIfTheNumberContains7() {
        assertEquals("Wizz", fizzBuzzer.execute(71));
        assertEquals("Wizz", fizzBuzzer.execute(78));
    }
    
    @Test
    public void executeShouldReturnFizzIfTheNumberContains5() {
        assertEquals("Buzz", fizzBuzzer.execute(51));
        assertEquals("Buzz", fizzBuzzer.execute(54));
    }
    
    @Test
    public void executeShouldReturnFizzIfTheNumberContains3() {
        assertEquals("Fizz", fizzBuzzer.execute(31));
        assertEquals("Fizz", fizzBuzzer.execute(83));
    }
    
    @Test
    public void executeShouldReturnWizzIfTheNumberIsDividableBy7() {
        assertEquals("Wizz", fizzBuzzer.execute(7));
        assertEquals("Wizz", fizzBuzzer.execute(21));
    }

    @Test
    public void executeShouldReturnFizzIfTheNumberIsDividableBy3() {
        assertEquals("fizz", fizzBuzzer.execute(3));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy5() {
        assertEquals("buzz", fizzBuzzer.execute(5));
        assertEquals("buzz", fizzBuzzer.execute(10));
    }

    @Test
    public void executeShouldReturnBuzzIfTheNumberIsDividableBy15() {
        assertEquals("fizzbuzz", fizzBuzzer.execute(15));
        assertEquals("fizzbuzz", fizzBuzzer.execute(30));
    }

    @Test
    public void executeShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        assertEquals("1", fizzBuzzer.execute(1));
        assertEquals("2", fizzBuzzer.execute(2));
        assertEquals("4", fizzBuzzer.execute(4));
        assertEquals("8", fizzBuzzer.execute(8));
    }

}
