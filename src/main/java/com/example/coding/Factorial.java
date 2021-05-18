package com.example.coding;

import java.util.stream.LongStream;

public class Factorial {

    // Producto de todos los numeros enteros positivos desde 1 hasta n.
    // n! = 1*2*...*(n-1)*n
    // 5! = 1*2*3*4*5 = 120

    public static long factorialRecursivo(int n){
        return (n == 1 || n == 0) ? 1 : n * factorialRecursivo(n - 1);
    }

    public static long factorialIterativo(int n){
        long result = 1;

        for (int i=2;i<=n;i++){
            result *= i;
        }
        return result;
    }

    public static long factorialStream(int n){
        return LongStream.rangeClosed(1,n).reduce(1,(long x, long y) -> x*y);
    }
}
