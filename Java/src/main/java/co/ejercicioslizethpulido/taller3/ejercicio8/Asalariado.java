package co.ejercicioslizethpulido.taller3.ejercicio8;

public class Asalariado implements Empleado {
    private final double salario;

    public Asalariado(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
