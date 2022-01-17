package com.example.coding;

import java.text.Normalizer;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ValidAnagram {

    // Dados dos String indicar si son anagramas
    // Dos String son anagramas si tienen los mismos caracteres en la misma frecuencia

    public static boolean validAnagram(String string1, String string2){

        // Contaremos el nº de las apariciones de cada letra y las almacenaremos en un hashMap
        // Posteriormente comprobaremos si los dos hashMap son iguales

        // Primero eliminamos los acentos y pasamos a minuscula
        Map<String, Integer> m1 = cleanString(string1).toLowerCase(Locale.ROOT).chars()
                                        .mapToObj(i->Character.toString(i))
                                        .collect(Collectors.toMap(Function.identity(), s->1, (s1, s2)->s1=s1+1));

        Map<String, Integer> m2 = cleanString(string2).toLowerCase(Locale.ROOT).chars()
                .mapToObj(i->Character.toString(i))
                .collect(Collectors.toMap(Function.identity(), s->1, (s1, s2)->s1=s1+1));

        return m1.equals(m2);
    }
    /*
        Clase que elimina los acentos y diacríticos
     */
    public static String cleanString(String texto) {
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD);
        texto = texto.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return texto;
    }
}
