package com.example.coding;

import java.util.ArrayList;
import java.util.List;

public class DescomponerNumCombSumas {

    // Dado un numero descomponerlo en la suma de k enteros positivos,

    public static void descomponer(int n,
                                   int totalActual,
                                   int inicio,
                                   ArrayList<Integer> resultadoParcial,
                                   List<List<Integer>> resultadoFinal){

        if(n == totalActual){
            resultadoFinal.add((List<Integer>) resultadoParcial.clone());
        }
        for (int i = inicio; i < n; i++) {
            int auxTotal = totalActual+i;
            if(auxTotal <= n){
                resultadoParcial.add(i);
                descomponer(n,auxTotal,i,resultadoParcial,resultadoFinal);
                resultadoParcial.remove(resultadoParcial.size() - 1);
            }
            else{
                return;
            }
        }
    }

}
