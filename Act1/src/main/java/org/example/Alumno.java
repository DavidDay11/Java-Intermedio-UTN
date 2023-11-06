package org.example;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private List<Inscripcion> inscripciones;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.inscripciones = new ArrayList<>();
    }

    public void inscribir(Materia materia) {
        Inscripcion inscripcion = new Inscripcion(this, materia);
        inscripciones.add(inscripcion);
    }

    public List<Inscripcion> getInscripciones() {
        return inscripciones;
    }
}
