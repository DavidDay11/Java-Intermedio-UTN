package org.example;

import java.util.List;

import static org.example.Ejercicio1.convertirMayusculas;
import static org.example.Ejercicio2.concatenarPalabrasMasLargas;

public class Main {
    public static void main(String[] args) {

        // Ejemplo de uso ejercicio1
        List<String> listaOriginal1 = List.of("java", "intermedio", "ejercicio", "strings");

        // Llamada al método para convertir a mayúsculas
        List<String> listaMayusculas = convertirMayusculas(listaOriginal1);

        // Imprimir la lista original y la lista en mayúsculas
        System.out.println("Lista Original: " + listaOriginal1);
        System.out.println("Lista en Mayúsculas: " + listaMayusculas);



        // Ejemplo de uso ejercicio2
        List<String> listaOriginal2= List.of("java", "intermedio", "ejercicio", "strings", "mayores", "caracteres");

        // Llamada al método para concatenar palabras más largas
        int longitudMinima = 6;
        String resultadoConcatenado = concatenarPalabrasMasLargas(listaOriginal2, longitudMinima);

        // Imprimir la lista original y el resultado de la concatenación
        System.out.println("Lista Original: " + listaOriginal2);
        System.out.println("Palabras más largas de " + longitudMinima + " caracteres: " + resultadoConcatenado);
    }
}