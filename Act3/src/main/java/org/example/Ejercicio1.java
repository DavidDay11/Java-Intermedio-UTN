package org.example;

import java.util.List;
import java.util.stream.Collectors;

public  class Ejercicio1 {

    public static List<String> convertirMayusculas(List<String> listaOriginal) {
        return listaOriginal.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
