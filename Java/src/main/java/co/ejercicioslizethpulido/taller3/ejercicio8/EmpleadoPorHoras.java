package co.ejercicioslizethpulido.taller3.ejercicio8;

public class EmpleadoPorHoras implements Empleado {
    private final int horasTrabajadas;
    private final double valorHora;

    public EmpleadoPorHoras(int horasTrabajadas, double valorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * valorHora;
    }
}
