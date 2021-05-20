package com.example.coding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumeroPalindromoTest {

    @Test
    void isPalindromo() {
        assertTrue(NumeroPalindromo.isPalindromo(1234321));
        assertTrue(NumeroPalindromo.isPalindromo(-1234321));
        assertTrue(NumeroPalindromo.isPalindromo(121));
        assertFalse(NumeroPalindromo.isPalindromo(23234234));
    }
}