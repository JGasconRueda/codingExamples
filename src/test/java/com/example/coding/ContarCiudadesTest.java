package com.example.coding;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContarCiudadesTest {

    private List<String> listaResultado;
    private List<String> listaCiudades;

    @BeforeEach
    void setUp() {
        listaCiudades = new ArrayList<>();
        listaCiudades.add("Sevilla");
        listaCiudades.add("Sevilla");
        listaCiudades.add("Barcelona");
        listaCiudades.add("Madrid");
        listaCiudades.add("Merida");
        listaCiudades.add("Merida");
        listaCiudades.add("Sevilla");
        listaCiudades.add("Badajoz");
        listaCiudades.add("Malaga");
        listaCiudades.add("Madrid");
        listaCiudades.add("Sevilla");
        listaCiudades.add("Barcelona");
        listaCiudades.add("Badajoz");
        listaCiudades.add("Barcelona");
        listaCiudades.add("Merida");
        listaCiudades.add("Madrid");
        listaCiudades.add("Merida");
        listaCiudades.add("Merida");
        listaCiudades.add("Madrid");
        listaCiudades.add("Madrid");
        listaCiudades.add("Merida");
    }

    @AfterEach
    void tearDown() {
        listaResultado = null;
        listaCiudades = null;
    }

    @Test
    void contarCiudadesConStream() {
        listaResultado = new ArrayList<>();
        listaResultado.add("Merida");
        listaResultado.add("Madrid");
        listaResultado.add("Sevilla");

        assertEquals(listaResultado,ContarCiudades.contarCiudadesConStream(listaCiudades,3));
    }

    @Test
    void contarCiudadesConFor() {
        listaResultado = new ArrayList<>();
        listaResultado.add("Merida");
        listaResultado.add("Madrid");
        listaResultado.add("Sevilla");

        assertEquals(listaResultado,ContarCiudades.contarCiudadesConFor(listaCiudades,3));
    }
}