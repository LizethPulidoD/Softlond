package co.ejercicioslizethpulido.taller2.ejercicio1;

import java.util.ArrayList;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        SistemaAlumnos sistemaAlumnos = new SistemaAlumnos();
        ArrayList<Float> notasLizeth = new ArrayList<>();
        Alumno alumnoLizeth = new Alumno(1026307339, "Lizeth", 22, notasLizeth);
        sistemaAlumnos.agregarAlumno(alumnoLizeth);
        sistemaAlumnos.asignarCalificacion(1026307339, 4.5f);
        sistemaAlumnos.asignarCalificacion(1026307339, 5f);
        sistemaAlumnos.asignarCalificacion(1026307339, 4f);

        ArrayList<Float> notasJohan = new ArrayList<>();
        Alumno alumnoJohan = new Alumno(1031307339, "Johan", 24, notasJohan);
        sistemaAlumnos.agregarAlumno(alumnoJohan);
        sistemaAlumnos.asignarCalificacion(1031307339, 5f);
        sistemaAlumnos.asignarCalificacion(1031307339, 3f);
        sistemaAlumnos.asignarCalificacion(1031307339, 3f);

        System.out.println("Mostrando alumnos...");
        sistemaAlumnos.mostrarAlumnos();
        Optional<Float> promedioLizeth = sistemaAlumnos.calcularPromedioDelAlumno(1026307339);
        promedioLizeth.ifPresent(promedio -> System.out.printf("Promedio del alumno %s es %.2f%n", alumnoLizeth.getNombre(), promedio));
        Optional<Float> promedioJohan = sistemaAlumnos.calcularPromedioDelAlumno(1031307339);
        promedioJohan.ifPresent(promedio -> System.out.printf("Promedio del alumno %s es %.2f%n", alumnoJohan.getNombre(), promedio));
    }
}