package org.example;
public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean aprobada() {
        for (Materia correlativa : materia.getCorrelativas()) {
            boolean aprobada = false;
            for (Inscripcion inscripcion : alumno.getInscripciones()) {
                if (inscripcion.getMateria() == correlativa) {
                    aprobada = true;
                    break;
                }
            }
            if (!aprobada) {
                return false;
            }
        }
        return true;
    }

    public Materia getMateria() {
        return materia;
    }
}