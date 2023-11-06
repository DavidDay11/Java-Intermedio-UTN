package org.example;
public class Main {
    public static void main(String[] args)
    {
        Alumno juan = new Alumno("Juan");
        Materia algoritmos = new Materia("Algoritmos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia diseñoSistemas = new Materia("Diseño de Sistemas");

        algoritmos.agregarCorrelativa(paradigmas);
        paradigmas.agregarCorrelativa(diseñoSistemas);

        juan.inscribir(algoritmos);
        juan.inscribir(paradigmas);

        Inscripcion inscripcionDiseño = new Inscripcion(juan, diseñoSistemas);

        // Verificar si Juan puede inscribirse en Diseño de Sistemas
        if (inscripcionDiseño.aprobada()) {
            System.out.println("Juan puede inscribirse en Diseño de Sistemas.");
        } else {
            System.out.println("Juan no puede inscribirse en Diseño de Sistemas.");
        }
    }
}
