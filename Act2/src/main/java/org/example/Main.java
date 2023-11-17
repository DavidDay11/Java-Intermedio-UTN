package org.example;


import java.util.List;

import static org.example.TransformadorDeStrings.transformarLista;

public class Main {

    public static void main(String[] args) {
        // Ejemplo de uso
        List<String> listaOriginal = List.of("uno", "dos", "tres", "cuatro");

        // Definir el método de transformación que convierte una cadena a mayúsculas.
        Transformador transformadorMayusculas = String::toUpperCase;

        // Transformar la lista original y almacenar los resultados en una nueva lista.
        List<String> listaTransformada = transformarLista(listaOriginal, transformadorMayusculas);

        // Imprimir la lista transformada.
        System.out.println("Lista Original: " + listaOriginal);
        System.out.println("Lista Transformada: " + listaTransformada);
    }


}
