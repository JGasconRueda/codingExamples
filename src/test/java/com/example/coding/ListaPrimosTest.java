package com.example.coding;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class ListaPrimosTest {

    ListaPrimos listaPrimos = new ListaPrimos();
    List<Integer> listaPrimosGenerados;

    @Test
    void testListaPrimosVacia() {
        List<Integer> listaPrimosVacia = new ArrayList<>();
        listaPrimosGenerados = listaPrimos.getListaPrimos(1);
        assertIterableEquals(listaPrimosGenerados,listaPrimosVacia);
    }

    @Test
    void testLista1Primo() {
        List<Integer> lista1Primo = List.of(2);
        listaPrimosGenerados = Collections.unmodifiableList(listaPrimos.getListaPrimos(2));
        assertIterableEquals(listaPrimosGenerados,lista1Primo);
    }

    @Test
    void testListaPrimos() {
        List<Integer> lista100PrimerosPrimos = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89 ,97);
        listaPrimosGenerados = listaPrimos.getListaPrimos(100);
        assertIterableEquals(listaPrimosGenerados,lista100PrimerosPrimos);
    }
}
