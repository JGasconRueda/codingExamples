package com.example.coding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    
    @Test
    void factorialRecursivo() {
        assertEquals(Factorial.factorialRecursivo(0),1);
        assertEquals(Factorial.factorialRecursivo(1),1);
        assertEquals(Factorial.factorialRecursivo(5),120);
        assertEquals(Factorial.factorialRecursivo(10),3628800);
    }

    @Test
    void factorialIterativo() {
        assertEquals(Factorial.factorialIterativo(0),1);
        assertEquals(Factorial.factorialIterativo(1),1);
        assertEquals(Factorial.factorialIterativo(5),120);
        assertEquals(Factorial.factorialIterativo(10),3628800);
    }

    @Test
    void factorialStream() {
        assertEquals(Factorial.factorialStream(0),1);
        assertEquals(Factorial.factorialStream(1),1);
        assertEquals(Factorial.factorialStream(5),120);
        assertEquals(Factorial.factorialStream(10),3628800);
    }
}