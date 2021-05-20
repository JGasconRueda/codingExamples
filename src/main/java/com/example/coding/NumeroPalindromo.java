package com.example.coding;

public class NumeroPalindromo {

    // Indica si un numero se puede leer igual de izquierda a derecha y de derecha a izquierda
    // Ej: 1234321, 121, -1234321

    public static boolean isPalindromo(int number){

        boolean result = false;
        int reverse = 0;
        int lastDigit;
        int num = number;

        if(number < 0){
            number*=-1;
            num*=-1;
        }

        while(num > 0) {
            lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }

        if(reverse == number){
            result = true;
        }

        return result;
    }

}
