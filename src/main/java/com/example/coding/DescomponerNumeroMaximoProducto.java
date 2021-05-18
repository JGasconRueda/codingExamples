package com.example.coding;

import java.util.HashMap;

public class DescomponerNumeroMaximoProducto {

    // Dado un numero descomponerlo en la suma de k enteros positivos, donde k>=2
    // y devolver el maximo producto de dichos enteros
    // n = 4
    // 4 = 1+1+1+1, 1+1+2, 1+3, 2+2
    // resultado = 4 (2+2, 2*2=4)

    public static int descomponerRecursivo(int n){

        int primero, segundo, producto;

        if(n <= 2){
            return 1;
        }

        int result = (n-1);
        for (int i = 2 ; i < n; i++) {
            primero = i;
            segundo = n - i;
            producto = primero * Math.max(segundo,descomponerRecursivo(segundo));
            if(producto > result){
                result = producto;
            }
        }
        return result;
    }

    public static int descomponerConMemoria(int n, HashMap<Integer,Integer> memoria){

        int primero, segundo, producto;

        if(n <= 2){
            return 1;
        }

        if(memoria.containsKey(n)){
            return memoria.get(n);
        }

        int result = (n-1);
        for (int i = 2 ; i < n; i++) {
            primero = i;
            segundo = n - i;
            producto = primero * Math.max(segundo,descomponerConMemoria(segundo,memoria));
            if(producto > result){
                result = producto;
            }
        }
        memoria.put(n,result);
        return result;
    }
}
