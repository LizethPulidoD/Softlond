package co.ejercicioslizethpulido.taller2.ejercicio1;

import java.util.List;

public class Alumno {
    private int identificacion;
    private String nombre;
    private int edad;
    private List<Float> calificaciones;

    public Alumno() {
    }

    public Alumno(int identificacion, String nombre, int edad, List<Float> calificaciones) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Float> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Float> calificaciones) {
        this.calificaciones = calificaciones;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", calificaciones=" + calificaciones +
                '}';
    }
}
