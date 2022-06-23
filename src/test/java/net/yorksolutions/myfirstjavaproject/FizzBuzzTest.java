package net.yorksolutions.myfirstjavaproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    // Annotation - is a marker that gives information to a framework
    //     always starts with an '@'
    //     can be applied to a method, class, field, argument, local variable

    // In TDD - Test Driven Design
    //     1. Make the test compile
    //     2. Make the test fail - you are testing your test
    //     3. Make the test pass

    // write a method that implements FizzBuzz
    // input is a number
    // output is a string
    // if the number input is a multiple of 3, then output "Fizz"
    // if the number input is a multiple of 5, then output "Buzz"
    // if the number input is a multiple of 3 and 5, then output "FizzBuzz"
    // otherwise output the number converted to a string i.e 4 -> "4"
    @Test
    void itShouldOutputAStringVersionOfTheNumberInput() {
        final String actual = new FizzBuzz().fizzbuzz(4);
        assertEquals("4", actual);
        final String actual7 = new FizzBuzz().fizzbuzz(7);
        assertEquals("7", actual7);
    }

    @Test
    void itShouldOutputFizzWhenTheInputIsAMultipleOf3() {
        final String actual = new FizzBuzz().fizzbuzz(3);
        assertEquals("Fizz", actual);
        final String actual7 = new FizzBuzz().fizzbuzz(6);
        assertEquals("Fizz", actual7);
    }

    @Test
    void itShouldOutputBuzzWhenTheInputIsAMultipleOf5() {
        final String actual = new FizzBuzz().fizzbuzz(5);
        assertEquals("Buzz", actual);
        final String actual7 = new FizzBuzz().fizzbuzz(10);
        assertEquals("Buzz", actual7);
    }

    @Test
    void itShouldOutputFizzBuzzWhenTheInputIsAMultipleOf3and5() {
        final String actual = new FizzBuzz().fizzbuzz(15);
        assertEquals("FizzBuzz", actual);
        final String actual7 = new FizzBuzz().fizzbuzz(30);
        assertEquals("FizzBuzz", actual7);
    }
}