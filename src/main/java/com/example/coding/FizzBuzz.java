package com.example.coding;

import java.util.Optional;

public class FizzBuzz {

    public static String fizzBuzzClasic(int numero){
        if(numero % 3 == 0 ){
            if(numero % 5 == 0){
                return "fizzbuzz";
            }
            else {
                return "fizz";
            }
        }
        else if(numero % 5 == 0){
            return "buzz";
        }
        return String.valueOf(numero);
    }

    public static String fizzBuzzClasic2(int numero){
        if(numero % 15 == 0 ){
                return "fizzbuzz";
        }
        else if(numero % 3 == 0){
            return "fizz";
        }
        else if(numero % 5 == 0){
            return "buzz";
        }
        return String.valueOf(numero);
    }

    public static String fizzBuzzClasic3(int numero){

        String resultado = numero % 3 == 0?"fizz":"";
        resultado+=numero % 5 == 0?"buzz":"";

        return resultado.isEmpty()?String.valueOf(numero):resultado;

    }


    public static String fizzBuzzJava8(int numero){

        String resultado = Optional.of(numero).map(n -> (n % 3 == 0? "fizz":"")+
                                                        (n % 5 == 0? "buzz":"")).get();

        return resultado.isEmpty() ? Integer.toString(numero) : resultado;
    }

}
