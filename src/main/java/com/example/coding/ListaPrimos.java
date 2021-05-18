package com.example.coding;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListaPrimos {

    public List<Integer> getListaPrimos(int n){
        // un número primo es un número natural mayor que 1 que tiene únicamente dos
        // divisores positivos distintos: él mismo y el 1

        //  división por tentativa: consiste en dividir sucesivamente ese número entre los números
        //  primos menores o iguales a su raíz cuadrada. Si alguna de las divisiones es exacta, entonces
        //  el número no es primo; en caso contrario, es primo

        return IntStream.rangeClosed(2,n)
                .filter(ListaPrimos::esPrimo)
                .boxed()
                .collect(Collectors.toList());
    }

    private static boolean esPrimo(int numero) {
        // Si es 2 es primo
        if(numero == 2 ){
            return true;
        }

        // Si es divisible por 2 no es primo
        if(numero % 2 == 0 ){
            return false;
        }

        double limiteSuperior = Math.floor(Math.sqrt(numero));

        for (int i = 3; i <= limiteSuperior;i+=2){
            if(numero % i == 0){
                return false;
            }
        }

        return true;
    }
}
