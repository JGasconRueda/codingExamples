package com.example.coding;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class DescomponerNumeroMaximoProductoTest {

    @Test
    void descomponerRecursivo() {

        assertEquals(1, DescomponerNumeroMaximoProducto.descomponerRecursivo(2));
        assertEquals(6, DescomponerNumeroMaximoProducto.descomponerRecursivo(5));
        assertEquals(36, DescomponerNumeroMaximoProducto.descomponerRecursivo(10));
    }

    @Test
    void descomponerConMemoria() {

        assertEquals(1, DescomponerNumeroMaximoProducto.descomponerConMemoria(2,new HashMap<>()));
        assertEquals(6, DescomponerNumeroMaximoProducto.descomponerConMemoria(5,new HashMap<>()));
        assertEquals(36, DescomponerNumeroMaximoProducto.descomponerConMemoria(10,new HashMap<>()));
    }
}