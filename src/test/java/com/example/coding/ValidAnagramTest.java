package com.example.coding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void validAnagram() {
        assertTrue(ValidAnagram.validAnagram("",""));
        assertFalse(ValidAnagram.validAnagram("prueba",""));
        assertFalse(ValidAnagram.validAnagram("","prueba"));
        assertTrue(ValidAnagram.validAnagram("Alegan","Ángela"));
        assertTrue(ValidAnagram.validAnagram("Riesgo","Sergio"));
        assertTrue(ValidAnagram.validAnagram("Desamparador","Desparramado"));
        assertTrue(ValidAnagram.validAnagram("Conservadora","Conversadora"));
        assertTrue(ValidAnagram.validAnagram("Irónicamente","Renacimiento"));
        assertTrue(ValidAnagram.validAnagram("Escandalizar","Zascandilear"));
        assertFalse(ValidAnagram.validAnagram("Hola","Adios"));
    }
}