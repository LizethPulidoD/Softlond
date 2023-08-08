package co.ejercicioslizethpulido.taller2.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SistemaAlumnos {
    private List<Alumno> alumnos;

    public SistemaAlumnos() {
        this.alumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno nuevoAlumno) {
        this.alumnos.add(nuevoAlumno);
    }

    public void asignarCalificacion(int identificacionDelAlumno, float calificacion) {
        int indiceDelAlumno = buscarIndiceDelAlumnoPorIdentificacion(identificacionDelAlumno);
        if (indiceDelAlumno == -1) {
            System.out.println("Alumno no encontrado.");
        } else {
            this.alumnos.get(indiceDelAlumno).getCalificaciones().add(calificacion);
        }
    }

    public Optional<Float> calcularPromedioDelAlumno(int identificacionDelAlumno) {
        int indiceDelAlumno = buscarIndiceDelAlumnoPorIdentificacion(identificacionDelAlumno);
        if (indiceDelAlumno == -1) {
            return Optional.empty();
        } else {
            Alumno alumnoEncontrado = this.alumnos.get(indiceDelAlumno);
            return Optional.of(calcularPromedio(alumnoEncontrado.getCalificaciones()));
        }
    }

    public void mostrarAlumnos() {
        for (Alumno alumno : this.alumnos) {
            System.out.println(alumno);
        }
    }

    private float calcularPromedio(List<Float> calificaciones) {
        if (calificaciones.isEmpty()) {
            return 0;
        } else {
            float promedio = 0F;
            for (float calificacion : calificaciones) {
                promedio += calificacion;
            }
            return promedio / calificaciones.size();
        }
    }

    private int buscarIndiceDelAlumnoPorIdentificacion(int identifacion) {
        int index = -1;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getIdentificacion() == identifacion) {
                index = i;
            }
        }
        return index;
    }
}
