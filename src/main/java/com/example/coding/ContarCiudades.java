package com.example.coding;

import java.util.*;
import java.util.stream.Collectors;

public class ContarCiudades {

    // Dado un array de ciudades devolver un array con las n ciudades que mas se repiten

    public static List<String>  contarCiudadesConStream(List<String> listaCiudades, int n){

        return listaCiudades.stream()
                .collect(Collectors.toMap(String::new, ciudad ->1, (c1,c2)->c1=c1+1)) // Map con ciudad, numApariciones
                                  //toMap(clave, valor, que hacer en caso de conflicto)
                .entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))// Ordenamos el map por Valores
                .limit(n) // Limitamos al nº ciudades pedidas
                .map(entry->entry.getKey()).collect(Collectors.toList());//Nos quedamos con la lista de claves (Ciudades)
    }

    public static List<String>  contarCiudadesConFor(List<String> listaCiudades, int n){

        List<String> resultado = new ArrayList<>();

        Map<String,Integer> mapCiudades = new HashMap<>();

        for (String ciudad: listaCiudades) {
            if(mapCiudades.containsKey(ciudad)){
                mapCiudades.put(ciudad,mapCiudades.get(ciudad)+1);
            }
            else {
                mapCiudades.put(ciudad,1);
            }
        }

        List<Map.Entry<String,Integer>> listaEntry = new ArrayList<>(mapCiudades.entrySet());
        listaEntry.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<String,Integer> entrada:listaEntry) {
            resultado.add(entrada.getKey());
        }

        if(n < resultado.size()) {
            return resultado.subList(0, n);
        }
        return resultado;

    }

}
