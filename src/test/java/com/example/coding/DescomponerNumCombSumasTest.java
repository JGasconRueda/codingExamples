package com.example.coding;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DescomponerNumCombSumasTest {

    List<List<Integer>> resultadoFinal = new ArrayList<>();

    @Test
    void descomponerCasoBase() {

        List<List<Integer>> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(Arrays.asList(1,1));
        DescomponerNumCombSumas.descomponer(2,0,1,new ArrayList<>(),resultadoFinal);
        assertIterableEquals(resultadoEsperado,resultadoFinal);
    }

    @Test
    void descomponerCasoGeneral() {

        List<List<Integer>> resultadoEsperado = new ArrayList<>();
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 2));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 3));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 1, 1, 1, 2, 2));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 1, 1, 1, 4));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 1, 1, 2, 3));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 1, 1, 5));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 1, 2, 2, 2));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 1, 2, 4));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 1, 3, 3));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 1, 6));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 2, 2, 3));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 2, 5));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 3, 4));
        resultadoEsperado.add(Arrays.asList(1, 1, 1, 7));
        resultadoEsperado.add(Arrays.asList(1, 1, 2, 2, 2, 2));
        resultadoEsperado.add(Arrays.asList(1, 1, 2, 2, 4));
        resultadoEsperado.add(Arrays.asList(1, 1, 2, 3, 3));
        resultadoEsperado.add(Arrays.asList(1, 1, 2, 6));
        resultadoEsperado.add(Arrays.asList(1, 1, 3, 5));
        resultadoEsperado.add(Arrays.asList(1, 1, 4, 4));
        resultadoEsperado.add(Arrays.asList(1, 1, 8));
        resultadoEsperado.add(Arrays.asList(1, 2, 2, 2, 3));
        resultadoEsperado.add(Arrays.asList(1, 2, 2, 5));
        resultadoEsperado.add(Arrays.asList(1, 2, 3, 4));
        resultadoEsperado.add(Arrays.asList(1, 2, 7));
        resultadoEsperado.add(Arrays.asList(1, 3, 3, 3));
        resultadoEsperado.add(Arrays.asList(1, 3, 6));
        resultadoEsperado.add(Arrays.asList(1, 4, 5));
        resultadoEsperado.add(Arrays.asList(1, 9));
        resultadoEsperado.add(Arrays.asList(2, 2, 2, 2, 2));
        resultadoEsperado.add(Arrays.asList(2, 2, 2, 4));
        resultadoEsperado.add(Arrays.asList(2, 2, 3, 3));
        resultadoEsperado.add(Arrays.asList(2, 2, 6));
        resultadoEsperado.add(Arrays.asList(2, 3, 5));
        resultadoEsperado.add(Arrays.asList(2, 4, 4));
        resultadoEsperado.add(Arrays.asList(2, 8));
        resultadoEsperado.add(Arrays.asList(3, 3, 4));
        resultadoEsperado.add(Arrays.asList(3, 7));
        resultadoEsperado.add(Arrays.asList(4, 6));
        resultadoEsperado.add(Arrays.asList(5, 5));

        DescomponerNumCombSumas.descomponer(10,0,1,new ArrayList<>(),resultadoFinal);
        assertIterableEquals(resultadoEsperado,resultadoFinal);
    }
}