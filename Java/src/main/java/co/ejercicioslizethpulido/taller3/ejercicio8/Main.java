package co.ejercicioslizethpulido.taller3.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = obtenerListaDeEmpleados();
        for (Empleado empleado : empleados) {
            System.out.printf("Salario calculado del empleado: %.2f%n", empleado.calcularSalario());
        }
    }

    private static List<Empleado> obtenerListaDeEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Asalariado(1030000));
        empleados.add(new EmpleadoATerminoFijo(1030000, 4));
        empleados.add(new EmpleadoPorHoras(90, 20000));
        empleados.add(new Asalariado(2030000));
        empleados.add(new Asalariado(5030000));
        return empleados;
    }
}
