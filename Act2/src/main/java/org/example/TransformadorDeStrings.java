package org.example;

import java.util.ArrayList;
import java.util.List;

public class TransformadorDeStrings {
    public static List<String> transformarLista(List<String> lista, Transformador transformador) {
        List<String> listaTransformada = new ArrayList<>();

        for (String elemento : lista) {
            listaTransformada.add(transformador.transformar(elemento));
        }

        return listaTransformada;
    }
}
