package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2 {

    public static String concatenarPalabrasMasLargas(List<String> listaOriginal, int n) {
        String resultado = listaOriginal.stream()
                .filter(palabra -> palabra.length() > n)
                .collect(Collectors.joining(", "));

        return resultado;
    }
}
