package com.example.coding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ContarPalabras {

    // Dado un texto cuanta las apariciones de cada palabra en dicho texto. Se ignoran los caracteres

    public static Map<String,Integer> ContarPalabrasConFor(String arrayPalabras){

        Map<String,Integer> result = new HashMap<>();

        String[] array = arrayPalabras.split(" ");

        for (String s : array) {
            s = s.replaceAll("[,.]", "");
            Integer valor = result.get(s);
            if (valor == null) {
                result.put(s, 1);
            } else {
                valor++;
                result.replace(s, valor);
            }
        }

        return result;
    }

    public static Map<String,Integer> ContarPalabrasConStreams(String arrayPalabras){

        return Arrays.stream(arrayPalabras.split(" ")).collect(
                Collectors.toMap(s1 -> s1.replaceAll("[,.]", ""), s1 ->1,(s1, s2) -> s1=s1+1));
    }

    private static boolean sonIguales(Map<String, Integer> first, Map<String, Integer> second) {
        if (first.size() != second.size()) {
            return false;
        }

        return first.entrySet()
                .stream()
                .allMatch(e -> e.getValue()
                        .equals(second.get(e.getKey())));
    }

    private static void imprimir(Map<String, Integer> map){
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(entry -> System.out.print(entry.getKey()+": "+entry.getValue()+" | "));
    }
}
