package com.example.coding;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testWithNumberIsDividableBy3() {
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzzClasic(3));
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzzClasic2(3));
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzzClasic3(3));
        Assert.assertEquals("fizz", FizzBuzz.fizzBuzzJava8(3));
    }

    @Test
    void testWithNumberIsDividableBy5() {
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzzClasic(5));
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzzClasic2(5));
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzzClasic3(5));
        Assert.assertEquals("buzz", FizzBuzz.fizzBuzzJava8(5));
    }

    @Test
    void testWithNumberIsDividableBy15() {
        Assert.assertEquals("fizzbuzz", FizzBuzz.fizzBuzzClasic(15));
        Assert.assertEquals("fizzbuzz", FizzBuzz.fizzBuzzClasic2(15));
        Assert.assertEquals("fizzbuzz", FizzBuzz.fizzBuzzClasic3(15));
        Assert.assertEquals("fizzbuzz", FizzBuzz.fizzBuzzJava8(15));
        Assert.assertEquals("fizzbuzz", FizzBuzz.fizzBuzzClasic(45));
        Assert.assertEquals("fizzbuzz", FizzBuzz.fizzBuzzClasic2(45));
        Assert.assertEquals("fizzbuzz", FizzBuzz.fizzBuzzClasic3(45));
        Assert.assertEquals("fizzbuzz", FizzBuzz.fizzBuzzJava8(45));
    }

    @Test
    void testOtherNumbers() {
        Assert.assertEquals("1", FizzBuzz.fizzBuzzClasic(1));
        Assert.assertEquals("1", FizzBuzz.fizzBuzzClasic2(1));
        Assert.assertEquals("1", FizzBuzz.fizzBuzzClasic3(1));
        Assert.assertEquals("1", FizzBuzz.fizzBuzzJava8(1));
        Assert.assertEquals("7", FizzBuzz.fizzBuzzClasic(7));
        Assert.assertEquals("7", FizzBuzz.fizzBuzzClasic2(7));
        Assert.assertEquals("7", FizzBuzz.fizzBuzzClasic3(7));
        Assert.assertEquals("7", FizzBuzz.fizzBuzzJava8(7));
    }
}